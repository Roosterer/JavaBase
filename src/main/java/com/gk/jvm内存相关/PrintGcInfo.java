package com.gk.jvm内存相关;

import java.util.ArrayList;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class PrintGcInfo {


    /**
     * 打印GC信息参数
     * -XX:+PrintGC
     * -XX:+PrintGCDetails
     * -XX:+PrintGCTimeStamps
     * -XX:+PrintGCDateStamps
     * -XX:+PrintHeapAtGC
     * <p>
     * -Xloggc:filename：把相关日志信息记录到文件以便分析
     * <p>
     * 打印出的gc信息解释：https://blog.csdn.net/alivetime/article/details/6895537
     * 官网解释：http://www.oracle.com/technetwork/java/javase/gc-tuning-6-140523.html
     * <p>
     * <p>
     * jstack，jmap，jstat命令：https://www.cnblogs.com/huane/p/6034538.html
     * 分析dump文件：https://blog.csdn.net/lifuxiangcaohui/article/details/37992725
     *
     * @param args
     */

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        int size = 0;
        while (true) {
            byte[] arr = new byte[1024 * 1024];      // 1M
            list.add(arr);
            System.out.println(++size + "M");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
