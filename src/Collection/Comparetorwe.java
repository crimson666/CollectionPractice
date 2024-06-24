package Collection;

import POJO.EmployeeAdvance;

import java.util.*;

public class Comparetorwe {
    public static void main(String a[]){
        Comparator<Integer> compare2 = (o1, o2) -> o1%10 > o2%10? 1:-1;



//        Comparator<EmployeeAdvance> compareEmppAge = new Comparator<EmployeeAdvance>() {
//            @Override
//            public int compare(EmployeeAdvance o1, EmployeeAdvance o2) {
//                if( o1.getAge()> o2.getAge()){
//                    return 1;
//                }else{
//                    return -1;
//                }
//            }
//        };

        List<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(1);
        number.add(45);
        number.add(11);
        number.add(2);
        number.add(34);
        Collections.sort(number,compare2);
        //System.out.println(number);

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
//        Collections.sort(empList,compareEmppAge);
        Collections.sort(empList);
        empList.forEach(System.out::println);

        String ab = "2432432sdfdsfds";

        Scanner sc = new Scanner(System.in);
        String sce = sc.nextLine();
        System.out.println(sce);
        sc.close();
        
        switch (sce){
            case "":
                System.out.println();
                break;
            default:
                System.out.println();
        }

    }
}
