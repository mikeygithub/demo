package java.thread;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/2/20 10:43 PM
 * @Version 1.0
 * @Description:
 * 线程：轻量级的进程，一个进程在执行的过程中可以产生多个线程。
 * 进程：程序的一次执行过程
 * 程序：含有<strong>指令和数据</strong>的文件，被存储在磁盘或其他数据存储设备中
 **/

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * 线程状态：
 * <li>NEW</li>
 * <li>RUNNABLE</li>
 * <li>BLOCKED</li>
 * <li>WAITING</li>
 * <li>TIME_WAITING</li>
 * <li>TERMINATED</li>
 *
 * 初始、运行、运行中、系统调度、等待、等待超时、阻塞、就绪、执行完成
 */
public class ThreadAbout {

    public static void main(String[] args) {

        //获取Java线程管理MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取同步的monitor和synchronizer信息，仍获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        //遍历线程信息，仅打印线程ID和线程名称信息
        for (ThreadInfo threadInfo : threadInfos){
            System.out.println("["+threadInfo.getThreadId()+"] "+threadInfo.getThreadName());
        }
        //[1] main
        //[2] Reference Handler
        //[3] Finalizer
        //[4] Signal Dispatcher
        //[9] Common-Cleaner
        //[10] Monitor Ctrl-Break

    }
}
