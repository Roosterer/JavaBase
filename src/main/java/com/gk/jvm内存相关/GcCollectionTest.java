package com.gk.jvm内存相关;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class GcCollectionTest {


    /**
     * 垃圾回收器
     * JVM给了三种选择：串行收集器、并行收集器、并发收集器。
     * 但是串行收集器只适用于小数据量的情况，所以这里的选择主要针对并行收集器和并发收集器。
     * 默认情况下，JDK5.0以前都是使用串行收集器，如果想使用其他收集器需要在启动时加入相应参数。
     * JDK5.0以后，JVM会根据当前系统配置进行判断。
     * <p>
     * <p>
     * 一、吞吐量优先的并行收集器，并行收集器主要以到达一定的吞吐量为目标，适用于科学技术和后台处理等。
     * 典型配置：
     * -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:+UseParallelGC -XX:ParallelGCThreads=20 -XX:+UseParallelOldGC -XX:MaxGCPauseMillis=100 -XX:+UseAdaptiveSizePolicy
     * -XX:+UseParallelGC：选择垃圾收集器为并行收集器。此配置仅对年轻代有效。即上述配置下，年轻代使用并发收集，而年老代仍旧使用串行收集。
     * -XX:ParallelGCThreads=20：配置并行收集器的线程数，即：同时多少个线程一起进行垃圾回收。此值最好配置与处理器数目相等。
     * -XX:+UseParallelOldGC：配置年老代垃圾收集方式为并行收集。JDK6.0支持对年老代并行收集。
     * -XX:MaxGCPauseMillis=100：设置每次年轻代垃圾回收的最长时间，如果无法满足此时间，JVM会自动调整年轻代大小，以满足此值。
     * -XX:+UseAdaptiveSizePolicy：设置此选项后，并行收集器会自动选择年轻代区大小和相应的Survivor区比例，以达到目标系统规定的最低相应时间或者收集频率等，此值建议使用并行收集器时，一直打开。
     *
     *
     * 二、响应时间优先的并发收集器，并发收集器主要是保证系统的响应时间，减少垃圾收集时的停顿时间。适用于应用服务器、电信领域等。
     * 典型配置：
     * -Xmx3550m -Xms3550m -Xmn2g -Xss128k -XX:ParallelGCThreads=20 -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:CMSFullGCsBeforeCompaction=5 -XX:+UseCMSCompactAtFullCollection
     * -XX:+UseConcMarkSweepGC：设置年老代为并发收集。测试中配置这个以后，-XX:NewRatio=4的配置失效了，原因不明。所以，此时年轻代大小最好用-Xmn设置。
     * -XX:+UseParNewGC：设置年轻代为并行收集。可与CMS收集同时使用。JDK5.0以上，JVM会根据系统配置自行设置，所以无需再设置此值。
     * -XX:CMSFullGCsBeforeCompaction：由于并发收集器不对内存空间进行压缩、整理，所以运行一段时间以后会产生“碎片”，使得运行效率降低。此值设置运行多少次GC以后对内存空间进行压缩、整理。
     * -XX:+UseCMSCompactAtFullCollection：打开对年老代的压缩。可能会影响性能，但是可以消除碎片
     *
     * 综上：一般互联网应用，使用并发收集器。
     * 设置-XX:+UseParNewGC老年代自动使用cms收集器。
     * 设置-XX:ParallelGCThreads=20并行进行垃圾回收的线程数量，一般设置为等同于处理器数量。
     * 设置-XX:+UseCMSCompactAtFullCollection，由于使用标记清楚会产生碎片，所以每次fullGc后进行整理。
     * 设置XX:CMSFullGCsBeforeCompaction，每次fullGc进行整理会影响性能。设置N次fullGc后进行整理。
     *
     * @param args
     */
    public static void main(String[] args) {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
