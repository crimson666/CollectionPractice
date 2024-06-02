package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinedList2 {
    public void execute(){
        Queue<String> Data =  new LinkedList<>();
        Data.offer("Sanepe1");//Diffrent from add cause if added then return true else return false
        Data.add("Dumpledore");//if add operation not conducted successfully then throw exception
        Data.offer("Sanepe2");
        Data.offer("Sanepe3");
        Data.offer("Sanepe4");
        System.out.println(Data.poll());//same as remove but if empty return null, remove return exception
        System.out.println(Data.peek());//if the queue is empty return false
        System.out.println(Data.element());//if the queue is empty then throw exception
        System.out.println(Data);
    }
}
