package cn.itcast.web.jedis;

import redis.clients.jedis.Jedis;

public class jedisDemo1 {
    public static void main(String[] args) {
        //获取链接
        Jedis jedis=new Jedis("localhost",6379);
        //执行操作
        jedis.set("username","zhangsan");
        // 释放内存
        jedis.close();
    }
}
