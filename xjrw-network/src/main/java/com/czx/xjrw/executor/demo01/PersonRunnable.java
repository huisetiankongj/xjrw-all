package com.czx.xjrw.executor.demo01;

public class PersonRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"=============大声喊出来");
        try {
            Thread.sleep(10*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
