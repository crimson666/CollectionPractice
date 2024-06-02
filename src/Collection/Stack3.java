package Collection;

import java.util.Stack;

public class Stack3 {
    public void execute(){
        Stack<String> Data = new Stack<>();
        Data.push("Snape1");
        Data.push("Snape1");
        Data.push("Snape2");
        Data.push("Snape3");
        Data.push("Snape4");
        //To see the contain
        System.out.println(Data.peek());
        //To Pop Item
        System.out.println(Data.pop());
        System.out.println(Data);
    }
}
