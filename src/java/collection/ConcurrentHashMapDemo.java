package java.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 12:46 AM
 * @Version 1.0
 * @Description:
 *
 * 1.ConcurrentHashMpa:
 *  在JDK1.7的时候ConcurrentHashMap（分段锁）对整个桶进行分割分段（Segment),每一把锁只锁容器中的一部分数据，多线程访问容器中的不同数据段的数据，就不会产生锁竞争，提高并发率。
 *  在JDK1.8取消了Segment分段锁，采用CAS和synchronized来保证并发安全，synchronized只锁定当前链表或红黑树的首节点。这样只要hash不冲突就不会产生并发，效率提升N倍。
 * 2.Hashtable(同一把锁)：使用synchronized来保证线程安全，效率非常低下。当一个线程访问同步方法时其他线程也同步访问，可能会进入阻塞或轮询状态，如使用put添加元素，另一个线程不能使用put添加元素，也不能使用get,竞争会越来越激烈
 **/

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    }
}
