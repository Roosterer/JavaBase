package com.gk.jvm内存相关;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class XssParameterTest {


    /**
     * Xss128k：设置每个线程的堆栈大小。
     * JDK5.0以后每个线程堆栈大小为1M，以前每个线程堆栈大小为256K。
     * 更具应用的线程所需内存大小进行调整。在相同物理内存下，减小这个值能生成更多的线程。
     * 但是操作系统对一个进程内的线程数还是有限制的，不能无限生成，经验值在3000~5000左右。
     * <p>
      * <p>
     * 注意：这里的Xss设置的时堆栈的大小，堆栈有N多栈帧组成，一个方法算是一个栈帧。
     * 通过递归的方式，测试不设置Xss和设置不同的Xss时能调用的递归深度。
     * <p>
     * 未设置：9141多次
     * 设置-Xss128k：885次
     * 设置-Xss1m：9103次： 由此可知jvm设置的默认Xss大小为1m
     * <p>
     * <p>
     * 扩展1：线程堆栈大小至少为108k，否则报错
     * Error: A fatal exception has occurred. Program will exit.
     * The stack size specified is too small, Specify at least 108k
     *
     * @param args
     */
    public static void main(String[] args) {

        // 1. 测试本机能生成的最大线程数
        XssParameterTest obj = new XssParameterTest();
        obj.maxThreadTest();
        // 结果：创建了102461程序退出。cpu和内存使用100%。
        // 猜想：如果将Xss设置为108K，每个线程使用的堆栈减少为默认1M的1/10，是否能创造出10倍多的线程。
        // 结论：但是对应的创建速度加快，线程数达到了109521。说明减小堆栈是可以创建更多线程的。


        // 2. 测试Xss堆递归深度的影响
//        obj.digui(0);

    }

    public void digui(int count) {
        System.out.println("count is " + count);
        digui(++count);
    }


    /**
     * 测试能生成的最大线程数
     */
    public void maxThreadTest() {

        int count = 0;
        while (true) {
            count++;
            Thread thread = new Thread(new TestThread());
            thread.start();
            System.out.println("#####count is " + count);
        }
    }


    private class TestThread implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
//                    System.out.println(Thread.currentThread().getId() + " is running");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
