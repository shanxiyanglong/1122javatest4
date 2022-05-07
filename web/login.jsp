<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/15
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>图书页面</title>
  </head>
  <body>
  <form action="LoginServlet" method="get">
    <table border="1" cellspacing="0" cellpadding="0" align="center">
      <caption>图书系统登录界面</caption>
      <tr>
        <td colspan="2">
          <span style="color: red">
            <c:if test="${param.msg=='loginfail'}">
              用户名或密码错误！
            </c:if>
          </span>
        </td>
      </tr>
      <tr>
        <td>
          用户名：
        </td>
        <td>
          <input type="text" name="username" placeholder="请输入用户名：">
        </td>
      </tr>
      <tr>
        <td>
          密码：
        </td>
        <td>
          <input type="password" name="password" placeholder="请输入密码：" >
        </td>
      </tr>
      <tr align="center">
        <td colspan="2">
          <input type="submit" value="登录">
        </td>
      </tr>
    </table>
  </form>
  </body>
</html>
