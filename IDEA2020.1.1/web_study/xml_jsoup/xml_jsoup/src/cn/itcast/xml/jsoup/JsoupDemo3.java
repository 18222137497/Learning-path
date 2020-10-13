package cn.itcast.xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * 选择器查询
 *  跟css的选择器差不多
 *      #div{
 *
 *      }
 */
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo3.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        //Elements student = document.getElementsByTag("student");
        Elements name = document.select("student[number='heima_0001']>age");//去看css的选择器，这里中间填空格也是一种方法
        System.out.println(name);
    }
}
