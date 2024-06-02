package Collection;


import POJO.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStuff {

    public void execute(){
        Map<Integer, String> numberData = new HashMap<>();
        numberData.put(1,"Ankur");
        numberData.put(2,"Ankur2");
        numberData.put(3,"Ankur3");

        if(!numberData.containsKey(3)){
            numberData.put(3,"Ankur4");
        }

        numberData.putIfAbsent(3,"Ankur5");

        //for iterating all elements
        for(Map.Entry<Integer,String> e: numberData.entrySet()){
            System.out.println(e.getKey() + "is containig " + e.getValue());
        }
        //for iterating keys
        for(Integer i:numberData.keySet()){
            System.out.println("Keys are " + i);
        }
        //for values
        for(String s: numberData.values()){
            System.out.println("Values are " + s);
        }
    }
}
