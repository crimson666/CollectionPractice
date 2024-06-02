package Collection;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDwdue2 {

    //ArrayDeque is nothing but adding and poping from both ends of the data list element

    public void execute() {
        ArrayDeque<Integer> Data = new ArrayDeque<>();
        Data.offer(23);//Diffrent from add cause if added then return true else return false
        Data.add(45);//if add operation not conducted successfully then throw exception
        Data.offer(72);
        Data.offer(12);
        Data.offer(34);
        System.out.println(Data);
        Data.offerFirst(100);
        Data.offerLast(200);
        System.out.println(Data);
        System.out.println(Data.peek());
        System.out.println(Data.peekFirst());
        System.out.println(Data.peekLast());

    }

}
