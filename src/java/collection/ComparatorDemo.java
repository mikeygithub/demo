package java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 1:09 PM
 * @Version 1.0
 * @Description:comparator接口实际上是出自java.util包它有一个compara（Object obj1,Object obj2)方法来排序
 **/

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(-100);
        arrayList.add(110);
        arrayList.add(-10);
        arrayList.add(1000);
        arrayList.add(1);
        arrayList.add(-1);
        arrayList.add(-11);

        System.out.println("原始数组："+arrayList);

        Collections.reverse(arrayList);

        System.out.println("反转数组："+arrayList);

        Collections.sort(arrayList);

        System.out.println("排序数组："+arrayList);

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("定制排序："+arrayList);


    }

}
