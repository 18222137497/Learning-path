<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="servlet/testRequestParam">
姓名<input type="text" name="name"><br>
    <input type="submit" value="提交">
</form>
<hr size="10" color="red">
<form action="servlet/testRequestBody" method="post">
    姓名<input type="text" name="name"><br>
    年龄<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
<a href="servlet/10">REST风格</a>
<br>
<a href="servlet/testRequestHeader">获取请求头信息</a>
<br>
<a href="servlet/testCookieValue">获取指定CookieValue值</a>
<br>
<form action="servlet/testModelAttribute1" method="get">
    id<input type="text" name="id"><br>
    name<input type="text" name="name"><br>
    <input type="submit" value="提交">
</form>
<a href="servlet/testSessionAttributesSetSession">添加session</a>
<a href="servlet/testSessionAttributesGetSession">获得session</a>
<a href="servlet/testSessionAttributesRemoveSession">删除session</a>

</body>
</html>
