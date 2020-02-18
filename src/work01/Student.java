package work01;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/18/20 11:03 PM
 * @Version 1.0
 * @Description:
 **/

public class Student extends Person{

    private Double sAnd;

    public Student() {
    }

    public Student(String pNo, String pName, String pSex, Integer pAge,Double sAnd) {
        super(pNo, pName, pSex, pAge);
        this.sAnd = sAnd;
    }

    public Double getsAnd() {
        return sAnd;
    }

    public void setsAnd(Double sAnd) {
        this.sAnd = sAnd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sAnd=" + sAnd +
                ", pNo='" + pNo + '\'' +
                ", pName='" + pName + '\'' +
                ", pSex='" + pSex + '\'' +
                ", pAge=" + pAge +
                '}';
    }
}
