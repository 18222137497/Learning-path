<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="cn.itcast.web.Context.Context_Demo1" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>记住上一次访问时间</title>
</head>
<%--
    1.概念
        * java Server Pages： java服务器端页面
            * 可以理解为：一个特殊的页面，其中既可以指定定义html标签，又可以定义java代码
            * 用于简化书写！！！
    2.原理
        * JSP本质上就是一个Servlet
    3.JSP的脚本：JSP定义java代码的方式
       1.<%代码%>:定义的java代码，在service方法中，servlet方法中可以定义什么，该脚本中就可以定义什么
       2.<%!代码%>:定义的java代码，在jsp转换后的java类的成员位置,定义成员变量或者成员方法，静态代码块，构造代码块等
       3.<%=代码%>:定义的java代码，会输出到页面上，输出语句中可以定义什么，该脚本中就可以定义什么,相当于一个sout
    4.JSP的内置对象：
        * 在jsp页面中不需要获取和创建，可以直接使用的对象
        * jsp一共有9个内置对象
        * 今天学习3个：
            * request
            * response
            * out:字符输出流对象，可以将数据输出到页面上，和response.getWriter类似
                * response.getWriter()和out.write()区别：
                    * 在tomcat服务器真正给客户端做出响应之前，会先找response缓冲区数据，再找out缓冲区数据
                    * response.getWriter()数据输出永远在out.write()之前
    --%>
<body>
<h1>记住上一次访问时间</h1><br>
    <%
        Cookie[] cookies = request.getCookies();
        boolean flag=false;
        if (cookies!=null&&cookies.length>0){
            for (Cookie c: cookies) {
                if (c.getName().equals("lastTime")){
                    flag=true;
                    Date date=new Date();
                    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String format = simpleDateFormat.format(date);
                    String encode = URLEncoder.encode(format, "utf-8");
                    out.print("您上一次登录的时间为:"+ URLDecoder.decode(c.getValue(),"utf-8"));
                    c.setValue(encode);
                    c.setMaxAge(60*10);
                    response.addCookie(c);
                    break;
                }
            }
        }
        if (cookies==null||cookies.length==0||flag==false){
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String format = simpleDateFormat.format(date);
            String encode = URLEncoder.encode(format, "utf-8");
            Cookie c=new Cookie("lastTime",encode);
            c.setMaxAge(60*10);
            c.setMaxAge(600);
            response.addCookie(c);
            out.print("欢迎第一次来");
        }
    %>
</body>
</html>
