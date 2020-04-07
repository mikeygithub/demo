package java.interfaces;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/2/20 12:44 PM
 * @Version 1.0
 * @Description: JDK9中允许定义私有方法/私有静态方法
 **/

public interface PrivateInterface {

    static String INTERFACE_TAG = "PRIVATE_INTERFACE_METHOD";

    private String getInterfaceTag() {

        return INTERFACE_TAG;
    };

    private static String getInterfaceTagStatic() {

        return INTERFACE_TAG;
    }

}
