<%@ page import="com.offcn.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/22
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    HttpSession session1 = request.getSession();
    User user = (User)session1.getAttribute("user");
    if (user == null) {
      response.sendRedirect("login.jsp");
    }
  %>
  </body>
</html>
