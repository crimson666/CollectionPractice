package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparetor {
    public static void main(String a[]){
        List<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(1);
        number.add(45);
        number.add(11);
        number.add(2);
        number.add(34);
        Collections.sort(number);
        System.out.println(number);
    }
}
