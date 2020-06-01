package com.example.tengfei.day09;

/**
 * @author by tengfei on 2020/4/24.
 * @description：
 */
public class DeadLockDemo {

    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {



    }

    private void deadLock(){
        Thread t1 = new Thread(() -> {
            synchronized (A){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (B){
                    System.out.println("1");
                }
            }
        });



        Thread t2 = new Thread(() -> {
            synchronized (B){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (A){
                    System.out.println("2");
                }
            }
        });

        t1.start();
        t2.start();


    }
}
