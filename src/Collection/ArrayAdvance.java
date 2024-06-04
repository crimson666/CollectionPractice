package Collection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAdvance {
    public void execute(){
        int[] number = {1,2,3,343,43,45,56,456,353,4};
        Arrays.sort(number);
        int index = Arrays.binarySearch(number,3);
        System.out.println("found in position " + index);

    }
}
