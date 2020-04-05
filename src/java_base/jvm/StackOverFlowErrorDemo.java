package java_base.jvm;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/5/20 5:48 PM
 * @Version 1.0
 * @Description:
 **/

public class StackOverFlowErrorDemo {
    public static void main(String[] args) {

        //若Java虚拟机栈的内存大小不允许动态扩展，那么当线程请求栈的深度超过当前Java虚拟机栈的最大深度时，就抛出StackOverError异常。
        main(args);

    }
}
