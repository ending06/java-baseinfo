package com.java.baseinfo.knowledge.code.multithread.sharedata;

import java.util.concurrent.TimeUnit;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/21<p>
// -------------------------------------------------------

public class StopThread {

    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                    System.out.println("i==>" + i);
                }
            }
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
        long end = System.currentTimeMillis();
        /**
         * 单线程运行
         * i==>133947
         * i==>133948
         * i==>133949
         * i==>133950
         * i==>133951
         * 耗时==>1005
         * */
        System.out.println("耗时==>" + (end - start));
    }
}