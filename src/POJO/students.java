package POJO;

import java.io.Serializable;

public class students implements Serializable {
    public students(String name, Integer standard, int age, long phoneNo) {
        this.name = name;
        this.standard = standard;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    private static final long serialVersionId = 1L;
    private String name;
    private Integer standard;

    private int age;
    private long phoneNo;

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
                '}';
    }
}
