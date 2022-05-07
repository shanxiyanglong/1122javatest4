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
import java.util.List;

@WebServlet("/SelectAllBookServlet")
public class SelectAllBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bs = new BookServiceImpl();
        List<Book> list = bs.selectAllBook();
        request.setAttribute("list",list);
        if (!list.isEmpty()) {
            request.getRequestDispatcher("showbook.jsp").forward(request,response);
        }else {
            response.sendRedirect("error.jsp");
        }
    }
}
