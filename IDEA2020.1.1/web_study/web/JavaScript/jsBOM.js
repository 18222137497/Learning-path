/*DOM简单学习*/
var img1=document.getElementById('img1');//获取对应id对象
//img1.src="img1/on.gif";//修改图片内容
var h1=document.getElementById('h1');//获取标题对象
//h1.innerHTML='不识妻美刘强东';//修改内容
/*事件简单学习*/
openimage=false;
img1.onclick=function f1() {//点击灯泡开关
    if (openimage) {
        img1.src = "img1/off.gif";//修改图片路径
        openimage=false;
    }else{
        img1.src = "img1/on.gif";//修改图片路径
        openimage=true;
    }
};
//img1.onclick=f1(img1);  下面代码有解决，这种写法暂时不知道为什么不行
/*
    BOM：
        1.概念：浏览器对象模型
            * 将浏览器的各个组成部分封装成对象
        2.组成：
            * Window:窗口对象
            * Navigator:浏览器对象
            * Screen:显示器屏幕对象
            * History:历史记录对象
            * Location:地址栏对象
        3.Window：窗口对象
            1.创建
            2.方法
                1.与弹出框有关的方法：
                    alert()显示带有一段消息和一个确认按钮的警告框
                    confirm()显示带有一段消息和一个确认按钮的对话框
                        *如果用户点击确定按钮，则方法返回true
                        *如果用户点击取消按钮，则方法返回false
                    prompt()显示课题是用户输入的对话框
                        *返回值：获取用户输入的值
                2.与打开关闭有关的方法：
                    close()关闭浏览器窗口
                        *谁调用我，我关谁
                    open()打开一个新的浏览器窗口
                        *返回新的Window对象
                3.与定时器有关的方法：
                    setTimeout()在指定的毫秒数后调用函数或计算表达式
                        *参数：
                            1.js代码或者方法对象
                            2.毫秒值
                        *返回值：唯一标识，用于取消定时器
                    clearTimeout()取消由setTimeout方法设置的timeout
                    setInterval()按照指定的周期(以毫秒计)来调用函数或者表达式
                    clearInterval()取消由setInterval()设置的timeout
            3.属性：
                1.获取其他BOM对象：
                    history
                    location
                    Navigator
                    Screen:
                2.获取DOM对象
                    document
            4.特点
                *Window对象不需要创建可以直接使用
                    window.方法名();
                *Window引用可以省略
                    方法名();
 */
window.alert('这是一个警告框');
var flag=confirm('确定和取消的对话框');//确定是true，取消是falase
if (flag){
    alert("欢迎")
}else{
    alert("您取消了");
}
var charr=prompt("请输入用户名");//参数为提示信息，返回输入内容
alert(charr);
var newwindow;
var opennewwindow=document.getElementById('opennewwindow');
opennewwindow.onclick=function o() {//这个方法可以在js里面设置点击事件
    newwindow=open('https://www.baidu.com');//打开这个网址
}
var closebutton=document.getElementById('closebutton');
closebutton.onclick=function c() {//这个方法可以在js里面设置点击事件
    newwindow.close();//谁调用谁关闭
}
var id1=setTimeout('alert("3秒过去了")',3000);//第一个参数是js语句  后面是毫秒数
clearTimeout(id1);//关闭计时器
var id2=setInterval('alert("2秒过去了")',2000);
clearInterval(id2);
/*
    轮播图
 */
var lbt=document.getElementById('lbt');
var indexx=0;
function lbt1(){
    switch (indexx) {
        case 0:
            lbt.src="./img1/banner_2.jpg"
            indexx++;
            break;
        case 1:
            lbt.src="./img1/banner_3.jpg"
            indexx++;
            break;
        case 2:
            lbt.src="./img1/banner_1.jpg"
            indexx=0;
            break;

    }
}
setInterval(lbt1,3000);
//window.document 获取DOM对象 window可以不写
/*
        4.Location：地址栏对象
            1.创建(获取)：
                1.window.location
                2.location
            2.方法
                *reload()重新加载当前文档，刷新
            3.属性
                *href 设置或返回完整的URL
 */

var flush=document.getElementById("flush");
flush.onclick=function () {//给按键添加刷新网页功能
    location.reload();//刷新当前页面
};
var urll=location.href;//获取当前的url地址
var gobaidu=document.getElementById('gobaidu');
gobaidu.onclick = function () {
    location.href='http://localhost:63342/web/Script2%E8%B7%B3%E8%BD%AC%E9%A1%B5%E9%9D%A2.html?_ijt=7dr5ib2thi9pusll1ef36ahlld';
    //返回一个网页，这里是直接跳转这个网页，不是新建窗口
    //自动跳转的网页地址
}
/*
        5.History：历史记录对象
            1.创建(获取)
                1.window.history
                history
            2.方法
                * back()     加载history列表中的前一个URL
                * forward()  加载history列表中的后一个URL
                * go(参数)    加载history列表中的某个具体页面
                    *参数：
                        *正数：前几个历史记录
                        *负数：后几个历史记录
            3.属性
                *length 返回当前窗口历史列表中的URL数量
 */
//history.length  返回当前窗口访问了几个网页了
var forwardup=document.getElementById('forwardup');
forwardup.onclick=function () {
    //history.go(-1); 和下面代码等效
    history.forward();//前进
}




