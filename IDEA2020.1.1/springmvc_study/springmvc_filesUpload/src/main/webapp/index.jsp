<%@page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>文件上传</h2>
<form action="servlet/fileUpload0" method="post" enctype="multipart/form-data">
    <input type="file" name="wj">
    <input type="submit" value="上传">
</form>
<h2>mvc文件上传</h2>
<form action="servlet/fileUpload1" method="post" enctype="multipart/form-data">
    <input type="file" name="upload">
    <input type="submit" value="上传">
</form>
<h2>跨服务器文件上传</h2>
<form action="servlet/fileUpload2" method="post" enctype="multipart/form-data">
    <input type="file" name="upload">
    <input type="submit" value="上传">
</form>
</body>
</html>
