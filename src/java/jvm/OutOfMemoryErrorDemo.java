package java.jvm;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/5/20 5:54 PM
 * @Version 1.0
 * @Description:
 **/

public class OutOfMemoryErrorDemo {

    public static void main(String[] args) {

        String tag = "TAG";

        while (true){
            tag+=tag;
        }

    }
}
