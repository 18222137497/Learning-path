package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //1.导入jsoup的jar包
        //2.获取Document对象，根据一个xml文档来获取
        //2.1获取student.xml路径
        URL student_xml = JsoupDemo1.class.getClassLoader().getResource("student.xml");
        String path = student_xml.getPath();
        //2.2解析xml文档，加载文档进内存，获取document树--->Document对象
        Document document1 = Jsoup.parse(new File(path), "utf-8");
        //3.获取对应的标签Element对象
        Elements elements = document1.getElementsByTag("name");
        System.out.println(elements.size());//2
        Element element = elements.get(0);
        String name = element.text();
        System.out.println(name);
        //4.获取对象

    }
}
