package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Jsoup对象
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        //第一种获取dom对象的方法
        Document document1 = Jsoup.parse(new File(path), "utf-8");
        //第二种获取dom对象的方法
//        Document document1 = Jsoup.parse("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
//                " <students   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
//                " \t\t\t xmlns=\"http://www.itcast.cn/xml\" \n" +
//                " \t\t   xsi:schemaLocation=\"http://www.itcast.cn/xml  student.xsd\"\n" +
//                " \t\t    >\n" +
//                " \t<student number=\"heima_0001\">\n" +
//                " \t\t<name>tom</name>\n" +
//                " \t\t<age>18</age>\n" +
//                " \t\t<sex>male</sex>\n" +
//                " \t</student>\n" +
//                "\t\t \n" +
//                " </students>");
        //第三种获取dom对象的方法
//        URL url=new URL("https://www.uc123.com/");
//        Document document1 = Jsoup.parse(url,3000);
        //获取element对象的集合
        //根据标签名称获取Element对象
        Elements student = document1.getElementsByTag("student");
        //根据属性名称获取Element对象
        Elements student1=document1.getElementsByAttribute("id");
        //根据对应属性名称的对应属性值称获取Element对象
        Elements student2 = document1.getElementsByAttributeValue("number", "heima_0001");
        //根据指定id获取Element对象
        Element student3 = document1.getElementById("1");
        Element element_student = student.get(0);
        //获取子标签对象
        Elements name = element_student.getElementsByTag("name");
        //获取对应标签的属性
        String id = name.attr("id");
        //获取标签内文本
        String text = name.text();
        //获取标签内的标签和文本
        String html = name.html();
        System.out.println(text+"   "+html);
        //Node对象需要了解一下，执行增删改的功能


    }
}
