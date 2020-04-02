package java_base.interfaces;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/2/20 7:19 PM
 * @Version 1.0
 * @Description:
 **/

interface Interface{

    String INTERFACE_TAG = "METHOD";

    private String getInterfaceTag() {

        return INTERFACE_TAG;
    };

    private static String getInterfaceTagStatic() {

        return INTERFACE_TAG;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println(Interface.INTERFACE_TAG);
    }
}
