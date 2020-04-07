package java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/3/20 4:06 PM
 * @Version 1.0
 * @Description:
 * List:对付顺序的好帮手，List接口存储一组不唯一（可以有多个元素引用相同的对象），有序的对象
 * <strong>有序、可重复</strong>
 *
 *
 *
 **/

public class ListDemo {

    public static void demo(String[] args) {

        long start = System.currentTimeMillis();

        List<String> list = new ArrayList<>();//耗时：1261 耗时：1211 耗时：1307
//        List<String> list1 = new LinkedList<>();//耗时：1935 耗时：1914 耗时：1993

        for (Integer i = 0; i < 1; i++) {
            list.add(i.toString());
//            list1.add(i.toString());
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时："+(end-start));
    }


    public static void main(String[] args) {
        //0000 1010
        //0000 0101
        System.out.println(10>>1);//ArrayList每次扩容为原来的1.5倍
        demo(args);
    }


}
