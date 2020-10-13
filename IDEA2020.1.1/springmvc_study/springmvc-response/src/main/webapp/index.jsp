<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<script src="js/jquery-3.3.1.js"></script>
<script>
    $(function () {
        $("#a").click(function () {
            $.ajax({
                url:"servlet/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"id":1,"name":"我自己","money":1024}',
                dataType:"json",
                type:"post",
                success:function (data) {
                    alert(data.money);
                }
            })
    });


})</script>
<body>

<a href="servlet/testString">testString</a><br>
<a href="servlet/testVoid">testVoid</a><br>
<a href="servlet/testModelAndView">testModelAndView</a><br>
<a href="servlet/testForwardOrRedirect">testForwardOrRedirect</a><br>
<button id="a">发送ajax请求</button>
</body>
</html>
