package java.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/3/20 4:23 PM
 * @Version 1.0
 * @Description:
 * HashMap在JDK1.8之前是<strong>数组+链表</strong>结合使用。就是链表散列。
 **/

public class MapDemo {

    /**
     * HashMap：非线程安全，默认容量：16，扩容2的幂次方，JDK1.8以后当链表长度大于阀值（默认8）将链表转为红黑树，以减少搜索时间。
     * HashTable：线程安全synchronized修饰方法，默认容量：11 扩容：2n+1
     */
    @Test
    public void hashTable() {
        Hashtable<String, String> stringStringHashtable = new Hashtable<>();
//        stringStringHashtable.put(null,null);
    }

    @Test
    public void  Capacity() {
        System.out.println(1<<30);
    }

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();


        hashMap.put("HashMap","HashMap");
        hashMap.put(null,null);
        hashMap.put(null,null);
        hashMap.put(null,null);
        System.out.println(hashMap);
        linkedHashMap.put(null,null);
        System.out.println(1000000000>>>16);//0011101110011010  >>> 无符号位移


    }
}
