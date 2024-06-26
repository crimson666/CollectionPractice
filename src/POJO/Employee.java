package POJO;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    public String email;
    public int salary;
    public long phone;
    public Employee(int id, String name, String email, int salary, long phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
//        return this.name.compareTo(o.name); // for String Stuff

    }
}
