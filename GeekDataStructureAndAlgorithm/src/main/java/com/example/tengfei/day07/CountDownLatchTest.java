package com.example.tengfei.day07;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * @author by tengfei on 2020/4/9.
 * @description：
 */
public class CountDownLatchTest {

    private ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    private CountDownLatch countDownLatch = new CountDownLatch(4);


    public void startUpTask() {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        Thread countUserThread = new Thread(() -> {
            System.out.println("正在统计新增用户数量");
            try {
                //Thread.sleep(3000);
                concurrentHashMap.put("countUserThread", "countUserThread");
                countDownLatch.countDown();
                System.out.println("统计新增用户数量完毕");
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        Thread countOrderThread = new Thread(() -> {
            try {
                System.out.println("正在统计订单数量");
                //Thread.sleep(3000);
                concurrentHashMap.put("countOrderThread", "countOrderThread");
                countDownLatch.countDown();
                System.out.println("统计订单数量完毕");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


        Thread countGoodsThread = new Thread(() -> {
            try {
                System.out.println("正在商品销量");
                Thread.sleep(3000);
                concurrentHashMap.put("countGoodsThread", "countGoodsThread");
                countDownLatch.countDown();
                System.out.println("统计商品销量完毕");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread countmoneyThread = new Thread(() -> {
            try {
                System.out.println("正在总销售额");
                Thread.sleep(3000);
                concurrentHashMap.put("countmoneyThread", "countmoneyThread");
                countDownLatch.countDown();
                System.out.println("统计销售额完毕");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        countUserThread.start();
        countOrderThread.start();
        countGoodsThread.start();
        countmoneyThread.start();

        try {
            countDownLatch.await();

            long endTime = System.currentTimeMillis();//记录结束时间
            System.out.println("------统计指标全部完成--------");
            System.out.println("统计结果为：" + concurrentHashMap.toString());
            System.out.println("任务总执行时间为" + (endTime - startTime) / 1000 + "秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CountDownLatchTest countDownLatchTest = new CountDownLatchTest();
        countDownLatchTest.startUpTask();

    }
}
