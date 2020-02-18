package work03;

import java.util.Date;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 2/19/20 12:02 AM
 * @Version 1.0
 * @Description:
 **/

public class Student {

    private Integer sNo;
    private String sName;
    private String sSex;
    private String sClass;
    private Date sBirthday;

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public String getsClass() {
        return sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public Date getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(Date sBirthday) {
        this.sBirthday = sBirthday;
    }

    public Student() { }

    public Student(Integer sNo, String sName, String sSex, String sClass, Date sBirthday) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sClass = sClass;
        this.sBirthday = sBirthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", sName='" + sName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sClass='" + sClass + '\'' +
                ", sBirthday=" + sBirthday +
                '}';
    }
}
