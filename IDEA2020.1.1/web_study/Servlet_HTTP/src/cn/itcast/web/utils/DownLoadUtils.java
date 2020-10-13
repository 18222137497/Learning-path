package cn.itcast.web.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 文件下载转码工具类
 *  中文文件下载
 */
public class DownLoadUtils {

    public static String getFileName(String agent, String filename) throws UnsupportedEncodingException {
        if (agent.contains("MSIE")) {
            // IE浏览器
            filename = URLEncoder.encode(filename, "utf-8");
            filename = filename.replace("+", " ");
        } else {
            // 其它浏览器
            filename = URLEncoder.encode(filename, "utf-8");
        }
        return filename;
    }
}
