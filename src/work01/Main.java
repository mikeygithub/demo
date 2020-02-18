package work01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/18/20 11:05 PM
 * @Version 1.0
 * @Description:
 **/

public class Main {

    public static void main(String[] args) {

        //构造数据
        ArrayList<Student> students = new ArrayList<>();
        //填充
        for (Integer i = 0; i < 5; i++) { students.add(new Student(i.toString(),i.toString(),i.toString(),i,Double.valueOf(i))); }
        //输出
        students.forEach(v->{ System.out.println(v); });
        //平均成绩
        Double sum = students.stream().collect(Collectors.summingDouble(v -> ((Double) v.getsAnd())));
        System.out.println("avg="+sum/students.size());
        //最大值
        Optional<Student> max = students.stream().max(Comparator.comparingDouble(Student::getsAnd));
        System.out.println("Max="+max.get().getsAnd().toString());
        //最小值
        Optional<Student> min = students.stream().min(Comparator.comparingDouble(Student::getsAnd));
        System.out.println("Min="+min.get().getsAnd().toString());

    }
}
