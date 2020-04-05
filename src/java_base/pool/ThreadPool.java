package java_base.pool;


import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/4/20 11:18 PM
 * @Version 1.0
 * @Description:
 * 为什么要使用线程池：
 * 1.降低资源的消耗
 * 2.提高响应速度
 * 3.提高线程的可管理性
 **/


class RunableDemo implements Runnable{

    private String command;

    public RunableDemo(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Start. Time = "+ new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName()+"Start. Time = "+ new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "RunableDemo{" +
                "command='" + command + '\'' +
                '}';
    }
}


public class ThreadPool {

    public static final int CORE_POOL_SIZE = 5;
    public static final int MAX_POOL_SIZE = 10;
    public static final int QUEUE_CAPACITY = 100;
    public static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, new ArrayBlockingQueue<>(QUEUE_CAPACITY), new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 10; i++) {
            RunableDemo demo = new RunableDemo("" + i);
            threadPoolExecutor.execute(demo);
        }

        threadPoolExecutor.shutdown();

        while (!threadPoolExecutor.isTerminated()){

        }
        System.out.println("FINISH ALL THREADS");
    }


}
