package java.thread;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 10:53 PM
 * @Version 1.0
 * @Description:
 **/

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getUniqueInstance(){

        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;

    }
}
