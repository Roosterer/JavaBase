package com.gk.jvm内存相关;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class MxMsMnParameterTest {


    /**
     *
     * 影响最大堆内存，初始堆内存，年轻代老年代比例，survivor和eden比例的四个参数如下：
     * -Xmx3550m -Xms3550m -XX:NewRatio=4 -XX:SurvivorRatio=4
     *
     * 设置以下两组参数，使用jvisualvm和jmx工具查看内存分配情况
     *
     * -Xmx3550m -Xms3550m -Xmn2g -Xss128k
     * -Xmx3550m -Xms3550m -Xss128k -XX:NewRatio=4 -XX:SurvivorRatio=4 -XX:MaxPermSize=16m -XX:MaxTenuringThreshold=0
     *
     *
     * 不配置任何参数：默认的内存比值
     * -Xmx2024m 最大堆内存本机总内存的1/4
     * -Xms130m  初始堆内存为130m左右，跟有没有设置最大堆内存无关
     * -Xmn      年轻代为最大堆内存的1/3，和一些资料上说的3/8差不多。剩余的2/3即为老年代内存了。
     * 一个survivor区默认大小为5m，看起来默认值也是固定的
     *
     * @param args
     */
    public static void main(String[] args) {

        while (true){

            try {
                Thread.sleep(1000);
                System.out.println("is running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
