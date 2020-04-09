package com.example.tengfei.day07;

import java.util.concurrent.Semaphore;

/**
 * @author by tengfei on 2020/4/9.
 * @description：
 */
public class SemaphoreTest {

    public static void main(String[] args) {

        //构造方法 permits 表示可以同时运行的线程
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < 5; i++) {
            new SecurityCheckThread(i, semaphore).start();
        }

    }

    private static class SecurityCheckThread extends Thread {

        private int index;

        private Semaphore semaphore;

        public SecurityCheckThread(int index, Semaphore semaphore) {
            this.index = index;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                //获取允许
                semaphore.acquire();
                System.out.println("No. " + index + " 正在执行 ");

                if (index % 2 == 0) {
                    Thread.sleep(3000);
                    System.out.println("No. "+index+" 不符合规定 ");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //释放允许
                semaphore.release();
                System.out.println("No. "+index+" 完成操作 ");
            }
        }
    }
}