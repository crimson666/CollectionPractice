package Collection;

import POJO.Employee;

import java.util.HashSet;
import java.util.Set;

public class SetAdvance {
    public void execute(){
        Set<Employee> DataEmployee= new HashSet<>();
        DataEmployee.add(new Employee(1,"Ankur","a@gmail.com",2300,73877822));
        DataEmployee.add(new Employee(2,"Megana","m@gmail.com",2700,73877822));
        DataEmployee.add(new Employee(3,"Arjun","ar@gmail.com",2300,73877822));
        DataEmployee.add(new Employee(4,"Nidhi","n@gmail.com",2400,73877822));
        DataEmployee.add(new Employee(5,"Mani","M@gmail.com",3400,73877822));
        DataEmployee.forEach(System.out::println);
    }
}
