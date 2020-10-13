package com.tarena.yadx.accesscontrol;
/**
 * 包的概念
 * @author 123
 *
 */
public class TestPackage {
	/*
	 * 一、package语句
	 *   1.定义类时需要指定类的名称但如果仅仅将类名作为类的唯一标识，则会出现命名冲突，会很麻烦
	 *   2.在java中用package包的概念来解决命名冲突的概念来解决命名冲突的问题，
	 *     在定义一个类时，除了定义类的名称外一般还需要制定一个包名：
	 *       package 包名；     包名.类名
	 *   3.包名也可以有层次结构，在一个包下包含另一个包：
	 *       package 包名1.包名2.......包名n;
	 *   4.（注意）如果各个公司或开发组织的程序员都随心所欲的命名包，那么不能解决命名冲突的问题，
	 *     因此在指定包名的时候应该遵守一定的规范。例如:
	 *       com.tarena.yadx.accesscontrol;
	 *       org.apache.commons.lang.StringUtils;
	 *       StringUtils:类名
	 *       org.apache.commons.lang:多级包目录
	 *       org.apache:公司或组织信息 www.apache.org
	 *       commons:表示项目的名称信息
	 *       lang:此工程下的模块信息
	 * 二、import语句
	 *   1.访问一个类的时候需要使用该类的全称-过于繁琐
	 *       org.apache.commons.lang.StringUtils su=new org.apache.commons.lang.StringUtils();   
	 *   2.可以通过关键字import语句对类的全称进行声明。
	 *       import 类的全局限定名称（包名+类名）;
	 *       import org.apache.commons.lang.StringUtils;
	 *   3.通过import语句声明了类的全称后，该源文件中就可以直接访问类名了
	 *       StringUtils su=new StringUtils();                      
	 *         
	 */

}
