<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%-- 导入标签库--%>
<html>
<head>
    <title>jsp+el+JSTL</title>
</head>
<body>

    <%--
        1.指令、
            *作用：用于配置jsp页面，导入资源文件
            *格式：
               <%@ 指令名称 属性名1="属性值1 属性名2=属性值2..."%>
            *分类：
                1.page：配置jsp页面的
                    *contentType：等同于response.setContentType()
                        1.设置响应体的mime类型一级字符集
                        2.设置当前jsp页面的编码(只能是高级的IDE才能生效，如果使用低级工具则需要设置pageEncoding=""来设置当前文件的编码)
                    *import:导包
                    *errorPage:当前页面发生异常后，会自动跳转到指定的错误页面
                        例如:errorPage="500.jsp"
                    *isErrorPage:标识当前也是是否是错误页面
                        *true：是，可以使用内置对象exception
                        *false：否 默认值。不可以使用内置对象exception
                2.include：页面包含的，导入页面的资源文件
                    *<%@include file="top.jsp"%>
                3.taglib：导入资源
                    *<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                         *prefix:前缀，自定义的
        2.注释
            1.html注释：
                <!--__>：只能注释html代码片段
            2.jsp注释:推荐使用
                       ：可以注释所有
        3.内置对象
            *在jsp页面中不需要创建，直接使用的对象
            *一共有9个：
                变量名					    真实类型						作用
                * pageContext				PageContext					当前页面共享数据，还可以获取其他八个内置对象
                * request					HttpServletRequest			一次请求访问的多个资源(转发)
                * session					HttpSession					一次会话的多个请求间
                * application				ServletContext				所有用户间共享数据
                * response					HttpServletResponse			响应对象
                * page						Object						当前页面(Servlet)的对象  this
                * out						JspWriter					输出对象，数据输出到页面上
                * config					ServletConfig				Servlet的配置对象
                * exception					Throwable					异常对象
     --%>
    ${3>4}
    <%
        List list=new ArrayList<String>();
        list.add("一");
        list.add("二");
        list.add("三");
        list.add("四");
        pageContext.setAttribute("list1", list);
        pageContext.setAttribute("list", list.get(0));
        request.setAttribute("list",list.get(1));
        session.setAttribute("list",list.get(2));
        application.setAttribute("list",list.get(3));
        Map map=new HashMap();
        map.put("一","1");
        request.setAttribute("map",map);
        int i=1;
        pageContext.setAttribute("i", i);
    %>
    ${pageScope.list}
    ${requestScope.list}
    ${sessionScope.list}
    ${applicationScope.list}
    ${requestScopemap.map.map}
    ${requestScope.map["map"]}
    <h3>if循环语句</h3>
    <c:if test="3<4">
        ${"".equals("")}
    </c:if>
    <h3>choose(switch case)语句</h3>
    <c:choose>
        <c:when test="${i==1}">i=1</c:when>
        <c:when test="${i==2}">i=2</c:when>
        <c:otherwise>其他情况</c:otherwise>
    </c:choose>
    <h3>普通for循环</h3>
    <c:forEach begin="0" end="10" var="i" step="1" varStatus="f">
        第${f.count}次循环，索引为${f.index},当前步长为${f.step},此时i的值为${i}<br>
    </c:forEach>
    <h3>foreach循环</h3>
    <c:forEach items="${list1}" var="str" varStatus="s">
        <c:if test="${s.count!=list1.size()}">
            ${str}___
        </c:if>
        <c:if test="${s.count==list1.size()}">
            ${str}
        </c:if>
    </c:forEach>

</body>
</html>
