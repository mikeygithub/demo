package work03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import static sun.security.krb5.internal.ktab.KeyTab.create;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/18/20 11:57 PM
 * @Version 1.0
 * @Description:
 * 连接数据库，并实现对student表中数据的增删改查操作，可
 * 以没有界面，但需要上交效果截图（操作成功后控制台的内容显示
 **/

public class Main {

    public static void main(String[] args) {

        Student student = new Student(1, "mikey","0", "class-1", new Date());

        Main main = new Main();
        main.create(student);
        main.retrieve(student.getsNo());
        main.update(student);
        main.delete(student.getsNo());

    }
    //删除
    private void delete(Integer integer) {

        try {

            Connection connection = JDBCUtils.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("delete from student where s_no = ?");
            preparedStatement.setInt(1,integer);
            preparedStatement.execute();

            System.out.println("删除结果：");
            retrieve(integer);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //修改
    private void update(Student student) {

        student.setsName("leo");

        try {
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update student set s_name = ? , s_sex = ? ,s_class = ? ,s_birthday = ? where s_no = ?");
            preparedStatement.setString(1, student.getsName());
            preparedStatement.setString(2, student.getsSex());
            preparedStatement.setString(3, student.getsClass());
            preparedStatement.setDate(4,new java.sql.Date(student.getsBirthday().getTime()));
            preparedStatement.setInt(5,student.getsNo());
            preparedStatement.executeUpdate();
            System.out.println("update result:");
            retrieve(student.getsNo());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //查询
    private void retrieve(Integer integer) {
        try {
            Student student = null;
            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from student where s_no = ?");
            preparedStatement.setInt(1, integer);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                student = new Student();
                student.setsNo(resultSet.getInt("s_no"));
                student.setsName(resultSet.getNString("s_name"));
                student.setsSex(resultSet.getString("s_sex"));
                student.setsClass(resultSet.getString("s_class"));
                student.setsBirthday(resultSet.getDate("s_birthday"));
            }
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //添加
    private void create(Student student) {
        try {

            Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert student value (?,?,?,?,?)");
            preparedStatement.setInt(1, student.getsNo());
            preparedStatement.setString(2, student.getsName());
            preparedStatement.setString(3, student.getsSex());
            preparedStatement.setString(4, student.getsClass());
            preparedStatement.setDate(5, new java.sql.Date(student.getsBirthday().getTime()));
            preparedStatement.execute();
            System.out.println("create result:");
            retrieve(student.getsNo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
