package POJO;

import java.io.Serializable;

public class students implements Serializable {
    public students(String name, Integer standard, int age, long phoneNo,int secreatNo) {
        this.name = name;
        this.standard = standard;
        this.age = age;
        this.phoneNo = phoneNo;
        this.secreatNo = secreatNo;
    }

    private static final long serialVersionId = 1L;
    private String name;
    private Integer standard;

    private int age;
    private long phoneNo;

    //transient will not allow it to be serialized , it will not be written in a file.
    transient int secreatNo;

    public int getSecreatNo() {
        return secreatNo;
    }

    public void setSecreatNo(int secreatNo) {
        this.secreatNo = secreatNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standerd) {
        standard = standard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", Standerd='" + standard + '\'' +
                ", age='" + age + '\'' +
                ", phoneNo=" + phoneNo +
                ", secreatN0=" + secreatNo +
                '}';
    }
}
