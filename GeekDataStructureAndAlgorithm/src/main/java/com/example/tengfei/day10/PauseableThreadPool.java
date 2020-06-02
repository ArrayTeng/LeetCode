package com.example.tengfei.day10;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author by tengfei on 2020/6/1.
 * @description：
 */
public class PauseableThreadPool extends ThreadPoolExecutor {



    private boolean isPaused = false;

    private final ReentrantLock reentrantLock = new ReentrantLock();

    /**
     * 借助 Condition 来休眠线程
     */
    private final Condition condition = reentrantLock.newCondition();

    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);

    }

    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }

    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }

    public PauseableThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        reentrantLock.lock();
        try {
            while (isPaused) {

                condition.await();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pause() {
        reentrantLock.lock();
        try {
            isPaused = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void resume() {
        reentrantLock.lock();
        try {
            isPaused = false;
            condition.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }


}
