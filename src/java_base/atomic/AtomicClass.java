package java_base.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/5/20 11:28 AM
 * @Version 1.0
 * @Description: 原子类
 * java.util.concurrent.atomic
 *
 * TODO:AtomicInteger类主要使用CAS(Compare and　swap)＋volatile方法来保证原子操作，从而避免ｓｙｎｃｈｒｏｎｉｚｅｄ的高开销，执行效率大为提升。
 **/

public class AtomicClass {

    /**
     * setup to use Unsafe.compareAndSwapInt for updates 更新操作时提供“比较并交换”的作用
     *
     * private static final jdk.internal.misc.Unsafe U = jdk.internal.misc.Unsafe.getUnsafe();
     * private static final long VALUE = U.objectFieldOffset(AtomicInteger.class, "value");
     *
     * @param args
     */
    public static void main(String[] args) {


        AtomicInteger atomicInteger = new AtomicInteger();

    }

}
