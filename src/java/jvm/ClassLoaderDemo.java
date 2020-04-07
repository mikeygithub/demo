package java.jvm;
/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/7/20 11:43 AM
 * @Version 1.0
 * @Description:
 **/

public class ClassLoaderDemo {
    public static void main(String[] args) {
//        new ClassLoader()
        System.out.println("ClassLoaderDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader());
        System.out.println("The Parent of ClassLoaderDemo's ClassloaderDemo " + ClassLoaderDemo.class.getClassLoader().getParent());
        System.out.println("The GrandParent of ClassLoaderDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader().getParent().getParent());
    }
}