package java.clone;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/3/20 2:01 PM
 * @Version 1.0
 * @Description: Shallow Clone：对基本数据类型进行值传递，对引用数据类型进行引用传递般的拷贝，此为浅拷贝。
 * Deep Clone:对基本数据类型进行值传递，对引用数据类型创建一个新对象，并复制其内容。
 **/

class Demo implements Cloneable{

    public String TAG = "DEMO";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Clone implements Cloneable{

    public int anInt;
    public Integer integer;
    public Demo demo = new Demo();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Demo demo = (Demo) this.demo.clone();
        Clone clone = (Clone) super.clone();
        clone.setDemo(demo);
        return clone;
    }

    @Override
    public String toString() {
        return "Clone{" +
                "anInt=" + anInt +
                ", integer=" + integer +
                ", demo=" + demo +
                '}';
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }
}


public class CloneDemo  {

    public static void main(String[] args) throws CloneNotSupportedException {

        Clone clone = new Clone();
        clone.setAnInt(1);
        clone.setInteger(24);
        clone.setDemo(new Demo());

        System.out.println(clone);

        Object clone1 = clone.clone();
        System.out.println(clone1);

        System.out.println(clone==clone1);
    }
}
