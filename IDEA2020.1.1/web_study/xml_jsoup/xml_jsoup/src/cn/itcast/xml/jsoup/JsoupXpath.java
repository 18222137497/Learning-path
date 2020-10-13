package cn.itcast.xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 看文档用，不用仔细记
 */
public class JsoupXpath {
    /*
        1.使用Jsoup的Xpath需要额外导入jar包
        2.查询w3c参考手册，使用xpath的语法完成查询
     */
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        String path = JsoupXpath.class.getClassLoader().getResource("student.xml").getPath();
        Document documment = Jsoup.parse(new File(path), "utf-8");
        //3.创建JXDocument对象
        JXDocument jd = new JXDocument(documment);
        //4.结合xpath语法查询,具体语法在w3c菜鸟教程里看
        //4.1查询所有的student标签
        List<JXNode> jxNodes = jd.selN("//student");
        for (JXNode jxx:jxNodes) {
            System.out.println(jxx);
        }
        System.out.println("----------------------------");
        //4.2查询所有student标签下的name标签
        List<JXNode> jx1 = jd.selN("//student/name");
        for (JXNode JXX: jx1) {
            System.out.println(JXX);
        }
        System.out.println("----------------------------");
        //4.3查询student标签下带有id属性的name标签
        List<JXNode> jx2 = jd.selN("//student/name[@id]");
        for (JXNode jxxx:
             jx2) {
            System.out.println(jxxx);
        }
        System.out.println("----------------------------");
        //4.3查询student标签下number属性值是'heima_0001'的标签
        List<JXNode> jx3 = jd.selN("//student[@number='heima_0001']");
        for (JXNode jxxx:
                jx2) {
            System.out.println(jxxx);
        }

    }
}
