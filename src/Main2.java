import POJO.Employee;
import POJO.EmployeeAdvance;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<EmployeeAdvance> empList = new ArrayList<>();
        empList.add(new EmployeeAdvance(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new EmployeeAdvance(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new EmployeeAdvance(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new EmployeeAdvance(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new EmployeeAdvance(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new EmployeeAdvance(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new EmployeeAdvance(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new EmployeeAdvance(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));
        empList.add(new EmployeeAdvance(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

//        ***Grouping Employees by City
//        Map<String,List<EmployeeAdvance>> empCity;
//        empCity = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getCity));

//        ***Group by gender and count
//        Map<String, Long> noOfMaleAndFemaleEmployees = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getGender,Collectors.counting()));

//        for(String s:noOfMaleAndFemaleEmployees.keySet()){
//            System.out.println("for city " + s + " " + noOfMaleAndFemaleEmployees.get(s));
//        }

//        ***name of the dept
//        empList.stream().map(EmployeeAdvance :: getDeptName).distinct().forEach(System.out::println);
//
//        ***Printing Employee Details by Age Criteria > 28
//        empList.stream().filter(EmployeeAdvance -> EmployeeAdvance.getAge() > 29).forEach(System.out::println);

//        ***Maximum age of the employee
//        int a = empList.stream().mapToInt(EmployeeAdvance::getAge).max().getAsInt();
//        System.out.println(a);

//        ***Average Age by Gender
//        Map<String,Double> AverageAgeByGender = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getGender,Collectors.averagingDouble(EmployeeAdvance::getAge)));
//        for(String s:AverageAgeByGender.keySet()){
//            System.out.println("for city " + s + " " + AverageAgeByGender.get(s));
//        }

//        ***Printing the Number of Employees in Each Department
//        Map<String,Long> numberOfEmployee = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getDeptName,Collectors.counting()));
//        for(String s:numberOfEmployee.keySet()){
//            System.out.println("for city " + s + " " + numberOfEmployee.get(s));
//        }

//        ***Finding the Oldest Employee
//        Optional<EmployeeAdvance> OldestEmployee = empList.stream().max(Comparator.comparingInt(EmployeeAdvance::getAge));

//        ***Finding the Youngest Female Employee
//        Optional<EmployeeAdvance> youngestFemaleEmp = empList.stream().filter(EmployeeAdvance -> EmployeeAdvance.getGender().equals("F")).min(Comparator.comparingLong(EmployeeAdvance::getAge));

//        ***Finding Employees by Age Range

//        ***Finding Department with Highest Number of Employees
//        Map.Entry<String,Long> Data = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getDeptName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
//
//        System.out.println("Max no of employees present in Dept :: " + Data.getKey());

//        ***Finding Employees from HR Department
//        Optional<EmployeeAdvance> Data = empList.stream().filter(employeeAdvance -> employeeAdvance.getDeptName().equals("IT")).findAny();
//        Iterator<EmployeeAdvance> ite = Data.stream().iterator();
//        while (ite.hasNext()){
//            System.out.println(ite.next());
//        }

//        ***Finding Departments with Over 3 Employees
//        empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getDeptName,Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>3).forEach(System.out::println);

//        ***Finding Distinct Department Names
//        empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getDeptName)).keySet().stream().distinct().forEach(System.out::println);
//        empList.stream().map(EmployeeAdvance::getDeptName).distinct().forEach(System.out::println);

//        ***Finding and Sorting Employees by City
//        Map<String,List<EmployeeAdvance>> Data = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getCity));
//        for(String s : Data.keySet()){
//            System.out.println( s + " Print employees " + Data.values());
//        }
//        empList.stream().filter(e->e.getCity().equals("Blore")).sorted(Comparator.comparing(EmployeeAdvance::getCity)).forEach(System.out::println);

//        ***Finding Employee Count in Every Department
//        Map<String,Long> data = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getDeptName,Collectors.counting()));
//        for(String s: data.keySet()){
//            System.out.println(s + " Department have " + data.get(s) + " employees");
//        }

//        ***Finding Department with the Highest Number of Employees

        Map.Entry<String,Long> Data = empList.stream().collect(Collectors.groupingBy(EmployeeAdvance::getDeptName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(Data.getValue());
    }
}
