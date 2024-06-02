package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet2 {
    public void execute(){
        Set<Integer> set= new HashSet<>();
        set.add(12);
        set.add(14);
        set.add(199);
        set.add(17);
        set.add(18);
        set.add(19);
        set.forEach(System.out::println); // order will be random
        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        // set.clear();

        Set<Integer> setList = new LinkedHashSet<>(); //order of the element remain same O(n)
        setList.add(12);
        setList.add(14);
        setList.add(199);
        setList.add(17);
        setList.add(18);
        setList.forEach(System.out::println);

        Set<Integer> setTree = new TreeSet<>();//order would be shorted and complexity O(log(n))
        setTree.add(12);
        setTree.add(14);
        setTree.add(199);
        setTree.add(17);
        setTree.add(18);
        setTree.forEach(System.out::println);

    }
}
