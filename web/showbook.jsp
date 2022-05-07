<%@ page import="com.offcn.bean.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/15
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="index.jsp"%>
<html>
<head>
    <title>图书页面</title>
</head>
<body>
<div>
    <p align="center">欢迎${sessionScope.user.username}登录本网站</p>
</div>

    <table border="1" align="center" cellpadding="0" cellspacing="0" width="60%">
        <caption>图书页面</caption>
        <tr align="center">
            <td>序号</td>
            <td>书名</td>
            <td>作者</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="b">
            <tr align="center">
                <td>
                        ${b.id}
                </td>
                <td>
                        ${b.bookName}
                </td>
                <td>
                        ${b.author}
                </td>
                <td>
                    <a href="PreUpdateServlet?id=${b.id}">修改</a>
                </td>
            </tr>
        </c:forEach>


    </table>


</body>
</html>
