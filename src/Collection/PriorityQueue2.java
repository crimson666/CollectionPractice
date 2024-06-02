package Collection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2 {
    public void execute(){
        Queue<Integer> Data =  new PriorityQueue<>(Comparator.reverseOrder());
        Data.offer(23);//Diffrent from add cause if added then return true else return false
        Data.add(45);//if add operation not conducted successfully then throw exception
        Data.offer(72);
        Data.offer(12);
        Data.offer(34);
//        System.out.println(Data.poll());//same as remove but if empty return null, remove return exception
//        System.out.println(Data.peek());//if the queue is empty return false
//        System.out.println(Data.element());//if the queue is empty then throw exception
        System.out.println(Data);
    }
}
