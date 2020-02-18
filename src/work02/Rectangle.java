package work02;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/18/20 11:45 PM
 * @Version 1.0
 * @Description: 长方型
 **/

public class Rectangle extends Polygon{

    private Double height;
    private Double wide;

    public Rectangle(Double height,Double wide) {
        this.height = height;
        this.wide = wide;
    }

    @Override
    public Double getArea() {
        return wide*height;
    }
}
