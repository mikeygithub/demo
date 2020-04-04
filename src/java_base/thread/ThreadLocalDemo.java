package java_base.thread;

import java.text.SimpleDateFormat;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 11:10 PM
 * @Version 1.0
 * @Description:
 **/

public class ThreadLocalDemo implements Runnable{

    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<>(){
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };

    @Override
    public void run() {

    }
}
