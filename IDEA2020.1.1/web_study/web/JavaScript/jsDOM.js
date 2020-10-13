/*
    DOM
        * 概念：Document Object Model 文档对象模型
            *将标语言记文档的各个组成部分，封装为对象，可以使用这些对象，对标记语言文档进行CRUD的动态操作
        * W3C DOM 标准被分为 3 个不同的部分：
            * 核心 DOM - 针对任何结构化文档的标准模型
                * Document:文档对象
                * Element:元素对象
                * Attribute:属性对象
                * Text:文本对象
                * Comment:注释对象

                * Node:节点对象，其他5个的父对象
            * XML DOM - 针对XML文档的标准模式
            * HTML DOM  - 针对HTML文档的标准模型
 */
/*
    * 核心DOM模型:
        * Document：文档对象
            1.创建(获取):在html do模型中可以使用window对象来获取
                * window.document
                * document
            2.方法：
                1.获取Element对象：
                    1.getElementBuId():根据id属性获取元素对象。id属性值一般唯一
                    2.getElementsByTagName():根据元素名称获取元素对象们，返回一个数组
                    3.getElementsByClassName(获取元素对象们。返回一个数组
                    4.getElementsByName():根据name属性值获取元素对象们，返回一个数组
                2.其他DOM对象：):根据Class属性值
                    createAttribute(name)
                    createComment()
                    createElement()
                    createTextNode()
            3.属性
        * Element:元素对象
            1.获取/创建：通过document来获取和创建
            2.方法：
             1.removeAttribute();删除属性
             2.setAttribute();设置属性
        * Node：节点对象，其他5个的父对象
            * 特点：所有dom对象都可以被认为是一个节点
            * 方法
                * CRUD dom树：
                    * appendChild():向节点的子节点列表的结尾添加新的子节点
                    * removeChild():删除(并返回)当前节点的指定子节点
                    * replaceChild():用新节点替换一个子节点
            * 属性：
                *parentNode 返回节点的父节点
 */
//获取元素对象的四种方式
var divs=document.getElementsByTagName('div');
//alert(divs.length);//5
var div_cls1=document.getElementsByClassName('cls1');
//alert(div_cls1.length);//2
var ele_username=document.getElementsByName('username');
//alert(ele_username.length);//1
//创建其他DOM的方法
var table=document.createElement('table')//创建元素对象
//alert(table);
var aaa=document.getElementsByTagName('a')[0];
var in1=document.getElementById('in1');
in1.onclick=function (){
    aaa.setAttribute('href','https://www.baidu.com');//给a[0]标签设置指定属性
}
var in2=document.getElementById('in2');
in2.onclick=function (){
    aaa.removeAttribute("href");//删除指定属性
}
//节点对象Node
var in3=document.getElementById('in3');
in3.onclick=function () {//删除子节点
    var div5=document.getElementById('div5');
    var div4=document.getElementById('div4');
    div4.removeChild(div5);//参数加引号会实现不了，具体查看方法内容
}
/*
    超链接功能：
        1.可以被点击，样式
        2.点击后跳转到指定href的url
    需求：保留1功能，去掉2功能
    实现：href='javascript:void(0);!!!

 */
var a1=document.getElementById('a1');
a1.onclick=function () {//删除子节点
    var div5=document.getElementById('div5');
    var div4=document.getElementById('div4');
    div4.removeChild(div5);
}
//添加子节点
var in4=document.getElementById('in4');
in4.onclick=function () {
    var div4=document.getElementById('div4');
    var div6=document.createElement('div');
    div6.setAttribute("id","div6");
    div4.appendChild(div6);
}
/*
    动态表格
 */
var user_id=document.getElementsByClassName('bin')[0];
var user_name=document.getElementsByClassName('bin')[1];
var user_sex=document.getElementsByClassName('bin')[2];
var add_user=document.getElementsByClassName('bin')[3];
add_user.onclick=function () {//添加按钮
    var uid=user_id.value;//获取id文本框中的值
    var uname=user_name.value;//获取id文本框中的值
    var usex=user_sex.value;//获取id文本框中的值
    var table=document.getElementsByTagName("table")[0];
    var table_tr=document.createElement("tr");
    table.appendChild(table_tr);
    table_tr.innerHTML='<td>'+uid+'</td><td>'+uname+'</td><td>'+usex+'</td><td>'+
        '<a href="javascript:void(0);" onclick="delTr(this)">删除</a>'+'</td>'
}
function delTr(obj) {
    var table_user=obj.parentNode.parentNode.parentNode;
    var tr_user=obj.parentNode.parentNode;
    table_user.removeChild(tr_user);
}
/*
    HTML DOM  ：如果不做前端，基本不用深究用的时候看文档就行
        1.标签体的设置和获取：innerHTML
        2.使用html元素对象的属性
        3.控制元素样式
            1.使用元素的style属性来设置
                如：
                    //修改样式方式1
                    div1.style.border='1px solid red';
                    div1.style.width='2000px';
                    //font-size-->fontSize
                    div1.style.fontSize='20px';
            2.提前定义好类选择器的样式，通过元素className属性来设置其class属性值
 */
var span1=document.getElementsByTagName("span")[0];
//span1.innerHTML='<input type="button" value="按钮">';//这个是替换
//span1.innerHTML+='<input type="button" value="按钮">';//这个是在后面加一个按钮，存在父子关系    ！！！！！！！！






