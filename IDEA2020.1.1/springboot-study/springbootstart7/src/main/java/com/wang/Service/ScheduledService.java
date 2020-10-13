package com.wang.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    //在一个特定的时间执行这个方法
    //cron表达式
    //秒 分 时 日 月 周几
//    @Scheduled(cron = "0 * * * * 1-7")//周一到周日的每一天的任何时候的第0秒执行
    /**
     * 30 0/5 10,18 * * ? 每天的10点和18点的30秒开始执行，每隔5分钟执行一次
     * 0 15 10 ? * 1-6 每周一到周六的10点15分执行
     */
    @Scheduled(cron = "0 10 23 * * ?")//每天的23点10分0秒执行这个方法
    public void hello(){
        System.out.println("hello执行");
    }
}
