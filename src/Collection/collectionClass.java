package Collection;

import POJO.Employee;

import java.util.*;

public class collectionClass {
    public void execute(){
        List<Integer> DataClass = new ArrayList<>();
        DataClass.add(12);
        DataClass.add(14);
        DataClass.add(15);
        DataClass.add(16);
        DataClass.add(17);
        DataClass.add(18);
        DataClass.add(18);
        DataClass.add(18);
        //System.out.println("min element " + Collections.min(DataClass));
//        System.out.println("max element " + Collections.min(DataClass));
//        System.out.println("Frequescy " + Collections.frequency(DataClass,18));

        Collections.sort(DataClass, Comparator.reverseOrder());
//        System.out.println(DataClass);



        List<Employee> employeeData = new ArrayList<>();
        employeeData.add(new Employee(1,"Ankur","a@gmail.com",2300,73877822));
        employeeData.add(new Employee(2,"Megana","m@gmail.com",2700,73877822));
        employeeData.add(new Employee(12,"Arjun","ar@gmail.com",2300,73877822));
        employeeData.add(new Employee(4,"Nidhi","n@gmail.com",2400,73877822));
        employeeData.add(new Employee(45,"Mani","M@gmail.com",3400,73877822));
        //Collections.sort(employeeData); //it will sort by id cause of the compare method
        Collections.sort(employeeData, new Comparator<Employee>() {
            //(o1,o2) -> o1.name.compareTp(o2.name)
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        employeeData.forEach(System.out::println);
    }
}
