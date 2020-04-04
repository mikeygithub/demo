package java_base.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 11:05 PM
 * @Version 1.0
 * @Description:
 *
 **/

public class ReetranLockDemo {

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock reentrantLock = new ReentrantLock();

        reentrantLock.lockInterruptibly();//可中断等待

    }
}
