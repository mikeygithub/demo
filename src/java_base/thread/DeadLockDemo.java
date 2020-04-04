package java_base.thread;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 9:20 PM
 * @Version 1.0
 * @Description:死锁案例
 *
 * 死锁的四个条件：
 * 1.互斥条件：该资源任意一个时刻只由一个线程占用。
 * 2.请求与保持条件：一个进程因请求资源而阻塞时，对已获得的资源不释放。
 * 3.不剥夺条件：线程已获取的资源在未使用之前不能被其他线程强行剥夺，只有自己使用完毕才释放资源。
 * 4.循环等待条件：若干进程之间形成一种头尾相接的循环等待资源关系。
 **/

public class DeadLockDemo {

    /**
     * sleep方法和wait方法异同：
     * 1.sleep没有释放锁，wait释放锁。
     * 2.两者都可以暂停线程的执行。
     * 3.wait通常被用于多线程之间的调用,sleep通常被用于暂停执行。
     * 4.wait方法被调用后，线程不会自动苏醒，需要别的线程调用同一个对象上的notify或者notifyAll方法。sleep方法执行完毕后线程会自动苏醒，或者可以使用wait(long timeout)超时后线程会自动苏醒。
     * 5.
     */


    public static Object res1 = new Object();//资源1
    public static Object res2 = new Object();//资源2

    public static void main(String[] args) {

        new Thread(()->{
            synchronized (res1){
                System.out.println(Thread.currentThread()+"get res1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"waiting get res2");
            }
            synchronized (res2){
                System.out.println(Thread.currentThread()+"get res2");
            }
        },"线程1")
//                调用start方法可以启动线程并使线程进入就绪状态，而run方法只是thread的一个普通方法而以，还是在主线程里面执行
                .start();

        new Thread(()->{
            synchronized (res2){
                System.out.println(Thread.currentThread()+"get res2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"waiting get res1");
            }
            synchronized (res1){
                System.out.println(Thread.currentThread()+"get res1");
            }
        },"线程2").start();
    }
}
