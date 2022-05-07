<%@ page import="com.offcn.bean.Book" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/20
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="index.jsp"%>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="UpdateBookServlet" method="get">
    <table border="1" cellspacing="0" cellpadding="0" align="center">
        <caption>修改页面</caption>
        <tr>
            <td colspan="2">
                <input type="hidden" name="id" value="${requestScope.book.id}">
            </td>
        </tr>
        <tr>
            <td>
                书名：
            </td>
            <td>
                <input type="text" name="bookName" value="${requestScope.book.bookName}">
            </td>
        </tr>
        <tr>
            <td>
                作者：
            </td>
            <td>
                <input type="text" name="author" value="${requestScope.book.author}">
            </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="提交修改">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
