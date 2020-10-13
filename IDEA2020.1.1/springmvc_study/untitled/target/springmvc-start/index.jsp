<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<h1>你好</h1>
<h2>Hello World!</h2>
<a href="hello">入门程序</a>
<a href="new/submit">提交表单</a>
<form id="form2" action="new/submit" method="post">
    id<input type="text" name="id">
    name<input type="text" name="name">
    money<input type="text" name="money">
    user.uname<input type="text" name="user.uname">
    user.upassword<input type="text" name="user.upassword">
    <input type="submit" value="提交">
</form>
<hr/>
<form id="form1" action="new/student" method="get">
    姓名:<input type="text" name="name"><br>
<%--    不给索引就默认，给索引就按索引排序--%>
    爱好:<input type="checkbox" name="like" value="篮球">篮球
        <input type="checkbox" name="like" value="跳舞">跳舞<br>
<%--    因为两个一样的key值，所以最后存入的结果会为 family={FATHER=的撒旦撒旦,的撒大苏打} --%>
    父亲:<input type="text" name="family['FATHER']">
    母亲:<input type="text" name="family['FATHER']">
    <input type="submit" value="提交">
</form>
<br>
<form action="new/zhuanhuan" method="post">
    <input type="text" name="date"><br>
    <input type="submit" value="提交">
</form>


</body>
</html>
