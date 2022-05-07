package com.offcn.servlet;

import com.offcn.bean.User;
import com.offcn.service.UserService;
import com.offcn.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService us = new UserServiceImpl();
        User user = us.selectUserByUsernameAndPassword(username, password);

        HttpSession session = request.getSession();
        session.setAttribute("user",user);

        if (user != null) {
            response.sendRedirect("SelectAllBookServlet");
        }else {
            request.getRequestDispatcher("login.jsp?msg=loginfail").forward(request,response);
        }
    }
}
