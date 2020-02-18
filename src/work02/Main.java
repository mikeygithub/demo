package work02;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/18/20 11:47 PM
 * @Version 1.0
 * @Description:
 **/

public class Main {

    public static void main(String[] args) {

        Double rectangleArea = new Rectangle(10.0, 10.0).getArea();

        System.out.println("长方型面积："+rectangleArea);

        Double triangleArea = new Triangle(3.0, 4.0,5.0).getArea();

        System.out.println("三角型面积："+triangleArea);
    }
}
