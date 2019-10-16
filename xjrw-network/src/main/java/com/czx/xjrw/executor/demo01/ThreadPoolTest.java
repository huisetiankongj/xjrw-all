package com.czx.xjrw.executor.demo01;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("===========");
        ExecutorService service = Executors.newFixedThreadPool(2);
        PersonRunnable p1 = new PersonRunnable();
        new Thread(p1,"t1").start();
        service.execute(p1);
        service.shutdown();
        //junit主线程结束子线程也会跟着结束
        Thread.sleep(10000);
    }

    @Test
    public void cacheThreadPoolTest() throws InterruptedException {
        System.out.println("===========");
        ExecutorService service = Executors.newCachedThreadPool();
        PersonRunnable p1 = new PersonRunnable();
        new Thread(p1,"t1").start();
        service.execute(p1);
        service.shutdown();
        //junit主线程结束子线程也会跟着结束
        Thread.sleep(10000);
    }

    public static void main(String[] args) {
        System.out.println("===========");
        ExecutorService service = Executors.newFixedThreadPool(2);
        PersonRunnable p1 = new PersonRunnable();
        PersonRunnable p2 = new PersonRunnable();
        PersonRunnable p3 = new PersonRunnable();
        PersonRunnable p4 = new PersonRunnable();
        PersonRunnable p5 = new PersonRunnable();
        service.execute(p1);
        service.execute(p2);
        service.execute(p3);
        service.execute(p4);
        service.execute(p5);
        service.shutdown();
    }
}
