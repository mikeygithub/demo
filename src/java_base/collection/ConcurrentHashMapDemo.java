package java_base.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 12:46 AM
 * @Version 1.0
 * @Description:
 *
 * 1.在JDK1.7的时候ConcurrentHashMap（分段锁）对整个桶进行分割分段（Segment),每一把锁只锁容器中的一部分数据，多线程访问容器中的不同数据段的数据，就不会产生锁竞争，提高并发率。
 **/

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    }
}
