/*
    事件监听机制：
        * 概念：某些组件被执行了某些操作后，触发某些代码的执行。
            *事件：某些操作，如：单击，双击，键盘按下了，鼠标移动了
            *事件源：组件。如：按钮 文本输入框
            *注册监听：将事件，事件源，监听器结合在一起，当时间源上发生了某个事件，则触发执行某个监听器代码

        * 常见的事件：
            1.点击事件：
                1.onclick:单击事件
                2.ondblclick:双击事件
            2.焦点事件：
                1.onblur:失去焦点
                2.onfocus:元素获得焦点
            3.加载事件：
                1.onload:一张页面或一副图像完成加载
            4，鼠标事件：
                1.onmousedown:鼠标按键被按下
                2.onmouseup:鼠标按键被松开
                3.onmousemove:鼠标被移动
                4.onmouseover:鼠标移到某元素上
                5.onmouseout:鼠标从某元素移开
            5.键盘事件：
                1.onkeydown:某个键盘按键被按下
                2.onkeyup:某个键盘按键被松开
                3.onkeypress:某个键盘按键被按下并松开
            6.选择和改变：
                1.onchange:域的内容被改变
                2.onselect:文本被选中
            7.表单事件：
                1.onsubmit:确认(提交)按钮被点击
                    *可以阻止表单提交
                        *返回true或者不返回不会阻止表单提交，只有返回false才会阻止表单提交
                2.onreset:重置按钮被点击
 */
//点击事件
var in1=document.getElementById('in1');
in1.onclick=function () {//单击事件
    var td1=document.getElementById('td1');
    var td1_value=td1.innerText;
    td1.innerHTML=parseInt(td1_value)+1;
}
var in2=document.getElementById('in2');
in2.ondblclick=function () {//双击事件
    var td1=document.getElementById('td1');
    var td1_value=td1.innerText;
    td1.innerHTML=parseInt(td1_value)-1;
}
//焦点事件：
var in3=document.getElementById('in3');
var d1=document.getElementById('d1');
var t1;
in3.onfocus=function () {//获得焦点
    clearTimeout(t1);
    d1.innerHTML="获得焦点";
}
in3.onblur=function () {//失去焦点
    d1.innerHTML='失去焦点';
    t1=setTimeout("d1.innerHTML='给上面的框焦点'",5000);//这里的js语句必须要用引号括起来
}
//加载事件 onload加载完调用他的对象再加载对应的方法
//一般用法:
window.onload=function () {//窗口加载完加载这个方法
    alert('窗口加载完了！我运行了！')
}
//鼠标事件
var d2=document.getElementById('d2');
var d3=document.getElementById('d3');
var d4=document.getElementById('d4');
var d5=document.getElementById('d5');
var d6=document.getElementById('d6');
var d7=document.getElementById('d7');
var d8=document.getElementById('d8');
var d9=document.getElementById('d9');
var img1=document.getElementById('img1');
var s1=document.getElementById("s1");
img1.onmouseover=function () {//鼠标移动到图片上
    img1.setAttribute('src','./img1/on.gif');
}
img1.onmouseout=function () {//鼠标离开图片
    img1.setAttribute('src','./img1/off.gif');
}
window.onmousemove=function () {//鼠标在浏览器窗口移动
    d2.innerHTML='鼠标在窗口中移动中';
    setTimeout('d2.innerHTML="鼠标静止"','0');//鼠标静止
}

window.onmousedown=function (event) {//鼠标按下鼠标键
    var key_mouse=event.button;
    if (key_mouse==0){
        d3.style.color='red';
    }
    if (key_mouse==1){
        d5.style.color='red';
    }
    if (key_mouse==2){
        d4.style.color='red';
    }
}
window.onmouseup=function (event) {//鼠标松开鼠标键
    d3.style.color='black';
    d4.style.color='black';
    d5.style.color='black';
}
//键盘事件    回车键keyCode是13
window.onkeydown=function (event) {//某个按键被按下
    var key_code=event.keyCode;
    d6.innerHTML=key_code;
}
window.onkeyup=function (event) {//某个按键被松开
    var key_code=event.keyCode;
    d7.innerHTML=key_code;
}
window.onkeypress=function (event) {//某个键被按下并松开，但这个方法有点问题，字母的unicode编码不匹配，懒得深究了
    var key_code=event.keyCode;
    d8.innerHTML=key_code;
}
//选择和改变
s1.onchange=function () {//选择事件
    var index=s1.selectedIndex;//获取选中项的索引
    var s1_vale=s1.options[index].value;//获取选中项的value
    var s1_text=s1.options[index].text;//获取选中项的文本
    d9.innerHTML=s1_text;
}
//onselect没懂，懒得看了
//表单事件
//最后这个简单说一下,跟上面的大同小异,onsubmit就是点击提交按钮的时候触发的事件，这个按钮可以阻止表单提交
document.getElementById('submit1').onsubmit=function () {//返回true或者不返回不会阻止表单提交，只有返回false才会阻止表单提交
    return false;
}









