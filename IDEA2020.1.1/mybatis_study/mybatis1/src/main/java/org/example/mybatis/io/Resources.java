package org.example.mybatis.io;

import java.io.InputStream;

/**
 * 使用类加载器读取配置文件的类
 */
public class Resources {
    /**
     * 根据传入的参数获取一个字节输入流
     * @param resource
     * @return 本类的类加载器加载配置文件到内存
     * @return 本类的类加载器加载配置文件到内存
     */
    public static InputStream getResourceAsStream(String resource){
        return  Resources.class.getClassLoader().getResourceAsStream(resource);
    }
}
