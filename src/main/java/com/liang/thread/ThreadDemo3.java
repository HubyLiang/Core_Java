package com.liang.thread;

/**
 * 四个线程交替操作一个变量,该变量的初始值为0,要求一,三 线程加1, 二,四线程个减1, 共10轮.
 * <p>
 * 生产者/消费者模式
 * <p>
 * 1. 线程  操作  资源类
 * 2. 高内聚 + 低耦合
 * 注意问题:
 * 避免线程虚假唤醒
 * 如果是三个及三个以上线程不允许使用if判断,可能存在虚假唤醒,应在循环中使用重新做安全判断
 */
public class ThreadDemo3 {

    public static void main(String[] args) {

        final ShareDemo3 shareDemo = new ShareDemo3();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                        shareDemo.increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Increment1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(200);
                        shareDemo.decrement();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Decrement2").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(300);
                        shareDemo.increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Increment3").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(400);
                        shareDemo.decrement();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "Decrement4").start();

    }
}


class ShareDemo3 {
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        while (number != 0) {
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        while (number == 0) {
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);
        this.notifyAll();
    }

}
