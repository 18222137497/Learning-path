/*
    javascript注释跟java一样
 */
//alert("我是外部的js文件")//网页提示
/*
    数据类型
        * 原始数据类型(基本数据类型)
            1.number 整数/小数/NaN(not js number 一个不是数字的数字类型)
            2.string 字符串。(没有字符概念) "abc" "js" 'abc'(单引号和双引号一样)
            3.boolean 布尔值
            4.null 一个对象为空的占位符
            5.undefined 未定义。如果一个变量没有给初始化值则会被默认赋值为undefined
        * 引用数据类型(对象)
 */
/*
    变量
        * 变量:一小块存储数据的内存空间
        * java语言是强类型的语言，而javascript是一个如弱类型语言
            1.强类型:在开辟变量储存空间时，定义了空间将来存储的数据的数据类型，只能存储固定类型的数据
            2.弱类型:在开辟变量存储空间时，不定义空间将来的存储类型，可以存储任意类型的数据
        * 语法:
            var 变量值=初始化值;
        * typeof 运算符:获得变量的类型
            * 注:null运算后得到的是object
 */
/*
    运算符
        1.一元运算符
            ++,--, + -
                ++ -- 自增自减
                + - 正负号
                    * 注意:再JS中，如果运算数不是运算符要求的类型，那么js引擎会自动地将运算数进行类型转换、
                        string转number:按照字面值转换，如果字面值不是数字，则转为NaN(不是数字的数字)
                        boolean转number:true为1,false为0;
        2.算数运算符
            + - * / %...
        3.赋值运算符
            = += -=...
        4.比较运算符
            > < >= == ===(全等于)
                1.类型相同:直接比较
                    * 字符串:按照字典顺序比较。按位逐一比较，知道得出大小为止
                2.类型不同:先进性类型转换，再比较
                    * === : 全等于。再比较之前如果类型不同直接返回false
        5.逻辑运算符
            && || !
                1.number:0或NaN为false
                2.string:出了空字符串("")都为true
                3.null&undefined:都是false
                4.对象:所有对象都是true
        6.三元运算符
            ?:表达式
            var js=3;
            var b=4;
            var c=js>b ? 1:0;
            * 语法:
                * 表达式 ? 值1:值2;
                * 判断表达式的值，如果是true则取值1，false则取值2
 */
/*
    JS特殊语法：
        1.语句以;结尾，如果一行只有一条语句则;可以省略不写(不建议)
        2.变量的定义使用var关键字，也可以不使用
            * 用：定义的变量是局部变量
            * 不用：定义的变量是全局变量(不建议)
 */
/*
    流程控制语句：(和java一样)
        switch:
            在java中，switch语句可以接受的数据类型:byte int short char,枚举(jdk1.5之后),String(1.7之后)
            在js中，switch语句可以接收任意的原始数据类型
 */
//99乘法表
document.write('<div>')
document.write('<table align="center">')
for (var i = 1; i <=9; i++) {
    document.write('<tr>')
    for (var j = 1; j <= i; j++) {
        document.write('<td>')
        document.write(i+"*"+j+"="+j*i+"&nbsp;&nbsp;&nbsp;");
        document.write('</td>')
    }
    document.write('</tr>')
    // document.write('<br>');
}
document.write('</table>')
document.write('</div>')
/*
    基本对象;
        1.Function:函数(方法)对象
            1.创建:
                1.var 方法名=new Function(形式参数列表,方法体);  //忘掉吧
                2.Function 方法名(形式参数列表){方法体};
                3.var 方法名=function(形式参数列表){方法体};
            2.方法:
            3.属性:
                length:形参的个数
            4.特点:
                1.方法定义时，形参的类型不用写，返回值类型也可以不用写
                2.方法名相同会覆盖
                3.在js中，方法的调用只与方法的名称有关，与参数列表无关
                4.在方法声明中有一个隐藏的内置对象(数组)，arguments,封装所有的实际参数
            5.调用:
                方法名(实际参数列表)
 */
// var fun=new Function ("js","b","alert(js);"); 第一种方式
// fun(3,4);
// function fun (js,b) {                        第二种方式
//       document.write(js+b);
// };
// fun(1,2);
var fun=function (a,b) {                      //第三种方法
    document.write(a+b);
};
fun(1,3);
document.write('<br>');
document.write(fun.length);//length:方法的形参的个数
document.write('<br>');
/*
    求任意个数的和
 */
function f(){
    var sum = 0;//这里要注意必须赋初值，要不然会返回NaN
    for (var i = 0; i < arguments.length; i++) {//这里一定是argumens.length,这个是实际参数的个数
        sum += f.arguments[i];
    }
    return sum;
};
var sum=f(1,2,3,4,5,6,7,8,9);
document.write(sum);
document.write('<br>');
/*
    2.Array:数组对象
        1.创建:
            1.var 数组名称=new Array(元素列表);
            2.var 数组名称=new Array(默认长度);
            3.var 数组名称=[元素列表];
        2.方法:
            join(参数);将数组中的元素按照指定的分割符拼接为字符串
            push();像数组的末尾添加一个或者更多元素，并返回新的长度
        3.属性:
            length：数组长度
        4.特点:
            1.js中，数组的元素的类型是可变的
            2.在js中，数组的长度是可变的
 */
var arr=new Array(1,2,3);//定义数组内容
var arr1=new Array(5);//定义数组长度
var arr2=[1,'2',true,3];//定义数组内容  这是简写模式
document.write(arr);
document.write('<br>');
document.write(arr1);
document.write('<br>');
document.write(arr2);
document.write('<br>');
arr2[4]=1;//数组的长度是可变的
arr2.push('最后一个');//在末尾添加一个元素
document.write(arr2.join('@'));//指定分割符拼接字符串
document.write('<br>');
/*
    3.Boolean:基本类型的包装类
    4.Date:日期对象
        1.创建
            var 对象名=new Date();
        2.方法
            toLocaleString():返回当前date对象对应的时间本地字符串格式
            getTime();返回毫秒值
 */
var date=new Date();
document.write(date.toLocaleString());//中国标准时间？？
document.write('<br>');
document.write(date.getTime());//获取毫秒值
/*
    5.Math:数学对象
        1.创建:
            * 特点：Math对象不用创建直接使用， Math.方法名();
        2.方法:
            1.random():返回0到1之间的随机数，含0不含1
            2.ceil(x):向上取整
            3.floor(x):向下取整
            4.round(x):四舍五入取整
        3.属性:
            PI: 圆周率
 */
document.write('<br>');
document.write(Math.PI);
document.write('<br>');
document.write(Math.random());//包含0不包含1 返回0到1之间的随机数
document.write('<br>');
document.write(Math.round(35));//四舍五入取整
document.write('<br>');
document.write(Math.ceil(3.1));//向上取整
document.write('<br>');
document.write(Math.floor(3.9));//向下取整
/*
    取 1~100的随机整数
 */
function f1() {
    return Math.round(Math.random()*100);
}
document.write('<br>');
document.write(f1());
/*
    6.Number:基本类型的包装类
    7.String:基本类型的包装类
    8.RegExp:正则表达式对象
        1.正则表达式:定义字符串的组成规则
            1.单个字符:[]
                如：[js][ab][js-zA-Z0-9_]
                *特殊符号代表特殊含义的单个字符
                    \d：单个数字字符[0-9]
                    \w：单个单词字符[js-zA-Z0-9_]
            2.量词符号:
                ?:表示出现0次或1次    最多出现一次
                *:表示出现0次或多次   出现任意次数
                +:表述出现1次或多次   至少出现一次
                {m,n}:表示 m<=数量<=n
                    * m如果缺省: {,n}:最多n次
                    * n如果缺省: {m,}:最少m次
            3.开始结束符号
                * ^:开始符号
                * $:结束符号
        2.正则对象
            1.创建
                1.var 对象名=new RegExp("正则表达式")
                2.var 对象名=/正则表达式/
            2.方法
                1.test(参数):验证指定的字符串是否符合正则定义的规范
 */
    document.write('<br>');
    var reg=new RegExp("\\w{6,12}");//这里需要注意一下，一个\是转义字符，所以这里要使用两个\\
    document.write(reg);
    document.write('<br>');
    var reg1=/^\w$/;
    document.write(reg1);
    var js="zhangsan";
    document.write('<br>');
    document.write(reg1.test(js));//验证指定的字符串是否符合指定的正则定义的规范
/*
    9.Global:
        1.特点：全局对象，这个Global中封装的方法不需要对象就可以直接调用
        2.方法：
            encodeURI(); url编码
            decodeURI(); url解码

            encodeURIComponent(); url编码，编码的字符更多
            decodeURIComponent(); url解码

            parseInt();将字符串转换为数字
                * 逐一判断每一个字符是否是数字，直到不是数字为止，将前边数字部分转为number
            isNaN();判断一个值知否为NaN
                * NaN六亲不认，连自己都不认，NaN参与的==比较全部为false

            eval();将javaScript字符串，把它作为脚本代码来执行
        3.URL编码
            传智播客 =  %E4%BC%A0%E6%99%BA%E6%92%AD%E5%AE%A2    (4个字，12个16进制编码，这四个就是utf-8编码)
            每个%为一个分界，百分号之间的内容是将(根据编码类型,一个字节是一个4位的2进制码)两个4位的二进制逐一变成16进制的再合并
            例如：%E4%BC =1110 0100 1011 1100
                          14   4    11   12
                          E    4    B    C
                            E4        BC
 */
document.write('<br>');
var str="http://www.baidu.com?wd=传智播客";
var encodeurl=encodeURI(str);//http://www.baidu.com?wd=%E4%BC%A0%E6%99%BA%E6%92%AD%E5%AE%A2
document.write(encodeurl);
document.write('<br>');
document.write(decodeURI(encodeurl));

document.write('<br>');
var str1="ttp://www.baidu.com?wd=传智播客";
var encodeurl1=encodeURIComponent(str1);
document.write(encodeurl1);//ttp%3A%2F%2Fwww.baidu.com%3Fwd%3D%E4%BC%A0%E6%99%BA%E6%92%AD%E5%AE%A2
document.write('<br>');
document.write(decodeURIComponent(encodeurl1));
document.write('<br>');

var str3="123";
var numb=parseInt(str3);
document.write(typeof numb);//number

document.write('<br>');
var str4="123adsad";
var numb1=parseInt(str4);
document.write(typeof numb1);//number
document.write('<br>');
document.write(numb1);//123
/*  isNaN();判断一个值知否为NaN
        * NaN六亲不认，连自己都不认，NaN参与的==比较全部为false
 */
NaN==NaN;//false
isNaN(NaN);//true

var jscode='alert(123)';
eval(jscode);//将字符串编程对应代码执行


