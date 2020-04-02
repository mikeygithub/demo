package java_base.equals;

import java.util.Objects;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/2/20 9:46 PM
 * @Version 1.0
 * @Description:
 * ==:比较对象地址(基本数据类型比较👈值,应用数据类型比较地址)
 * equals:类未覆盖equlas方法。等价于==
 **/
class Demo {
    private String TAG = "DEMO";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return Objects.equals(TAG, demo.TAG);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAG);
    }
}
public class Main {

    public static void main(String[] args) {

        String str_1 = new String("ab");
        String str_2 = new String("ab");

        String str_3 = "ab";
        String str_4 = "ab";

        System.out.println(str_1==str_2);
        System.out.println(str_1==str_3);
        System.out.println(str_3==str_4);

        System.out.println(str_1.equals(str_2));
        System.out.println(str_3.equals(str_4));
    }

    public static void main_demo(String[] args) {

        Integer num_1 = Integer.valueOf(116);
        Integer num_2 = Integer.valueOf(116);


        System.out.println(num_1==num_2);
        System.out.println(num_1.equals(num_2));


        Demo demo_1 = new Demo();
        Demo demo_2 = new Demo();

        System.out.println(demo_1==demo_2);
        System.out.println(demo_1.equals(demo_2));
    }
}
