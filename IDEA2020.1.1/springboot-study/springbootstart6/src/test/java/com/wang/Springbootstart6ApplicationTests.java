package com.wang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springbootstart6ApplicationTests {

    @Autowired
    private JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        //发送一个简单的邮件
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("邮件题目");
        message.setTo("18222137497@163.com");//发给谁
        message.setFrom("252587065@qq.com");//从哪发
        message.setText("邮件正文");
        mailSender.send(message);//发送
    }

    @Test
    void contextLoads2() throws MessagingException {
        //一个复杂的邮件
        MimeMessage mimeMailMessage=mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMailMessage, true);//支持附件(等多部份)
        //正文
        helper.setSubject("邮件题目");
        helper.setTo("18222137497@163.com");//发给谁
        helper.setFrom("252587065@qq.com");//从哪发
        helper.setText("<h1></h1>",true);//发送支持html格式的文本
        helper.addAttachment("1.txt",new File("src\\main\\resources\\static\\1.txt"));//发送附件
        mailSender.send(mimeMailMessage);//发送/

    }

}
