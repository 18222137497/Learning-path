<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2020/5/23
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  你好，Servlet_HTTP<br>
  <a href="/Servlet_HTTP/Request_Demo2">访问/Request_Demo2</a><br>
  <form action="/Servlet_HTTP/Request_Demo3" method="post">
    <input type="text" name="username" placeholder="用户名"><br>
    <input type="password" name="password" placeholder="密码"><br>
    <input type="submit" value="登录">
  </form>
  <%
    System.out.println("index.jsp");
  %>
  </body>
</html>
