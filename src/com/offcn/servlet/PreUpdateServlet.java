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

@WebServlet("/PreUpdateServlet")
public class PreUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        BookService bs =  new BookServiceImpl();
        Book book = bs.selectBookById(Integer.parseInt(id));
        if (book != null) {
            request.setAttribute("book",book);
            request.getRequestDispatcher("update.jsp").forward(request,response);
        }else {
            response.sendRedirect("error.jsp");
        }
    }
}
