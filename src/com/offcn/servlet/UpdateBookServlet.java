package com.offcn.servlet;

import com.offcn.bean.Book;
import com.offcn.service.BookService;
import com.offcn.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String bookName = request.getParameter("bookName");
        String author = request.getParameter("author");
        Book book = new Book(Integer.parseInt(id),bookName,author);
        BookService bk = new BookServiceImpl();
        int i = bk.updateBook(book);
        if (i != 0) {
            response.sendRedirect("SelectAllBookServlet");
        }else {
            response.sendRedirect("error.jsp");
        }
    }
}
