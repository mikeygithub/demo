package java_base.finals;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/3/20 12:18 AM
 * @Version 1.0
 * @Description:
 * final
 * 可修饰变量、方法、类
 * 变量：一旦初始化不可修改、引用类型不可指向新的对象
 * 方法：锁定方法不可修改、早期用于提高方法效率、类中所有的private方法都隐试的指定未final
 **/

public class Main {

    private String privateMethod() {
        return this.toString();
    }

}
