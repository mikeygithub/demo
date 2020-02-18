package work01;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/18/20 11:01 PM
 * @Version 1.0
 * @Description:
 **/

public class Person {

    protected String pNo;
    protected String pName;
    protected String pSex;
    protected Integer pAge;

    public Person() {}

    public Person(String pNo, String pName, String pSex, Integer pAge) {
        this.pNo = pNo;
        this.pName = pName;
        this.pSex = pSex;
        this.pAge = pAge;
    }

    public String getpNo() {
        return pNo;
    }

    public void setpNo(String pNo) {
        this.pNo = pNo;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }
}
