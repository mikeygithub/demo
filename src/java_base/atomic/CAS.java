package java_base.atomic;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/5/20 11:36 AM
 * @Version 1.0
 * @Description:
 * CAS:　的原理是拿一个期望的值和原本的一个值比较，如果相同则更新成新的值，Unsafe类的objectFieldOffset()方法是一个本地方法，这个方法是用来拿到“原来的值”的内存地址，返回值是valueOffset
 * 另外ｖａｌｕｅ是一个ｖｏｌａｔｉｌｅ变量，在内存中可见，因此ＪＶＭ可以保证任何时刻线程总能拿到该变量的最新值。
 **/

public class CAS {
}
