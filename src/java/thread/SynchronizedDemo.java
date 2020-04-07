package java.thread;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 10:06 PM
 * @Version 1.0
 * @Description:
 *
 * 解决的是多个线程之间的访问资源的同步性，synchronized关键字可以保证它修饰的方法或者代码块在任意时刻只能有一个线程运行，另外在早期Java版本中，synchronized属于重量级锁，效率低下，因为监视器锁（Monitor）
 * 是依赖于底层的操作系统Mutex Lock 来实现的,Java的线程是映射到操作系统的原生线程上的。如果要挂起或唤醒一个线程，都需要操作系统帮忙完成，而操作系统实现线程之间的切换时需要从用户态转换到内核态，这个状态之间
 * 的转换需要相对比较长的时间，时间成本相对较高，这也是为什么早期的synchronized效率低原因。Java6之后Java官方从JVM层面对synchronized较大优化，所以现在的synchronized锁效率优化得很不错。JDK1.6对锁的实现
 * 引入了大量的优化，如自旋锁、锁消除、锁粗化、偏向锁、轻量级锁等技术来减少锁操作的开销。
 *
 * 可修饰：实例方法、静态方法、代码块
 **/

public class SynchronizedDemo {

//    public static void main(String[] args) {
//
//
//
//    }

    public void method() {
        synchronized (this){
            System.out.println("synchronized 代码块");
        }
    }
}
