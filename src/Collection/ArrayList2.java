package Collection;

import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
    public void execute(){
        List<String> Data= new java.util.ArrayList<>();
        Data.add("Snape");
        Data.add("Snape2");
        Data.add("Snape3");
        List<String> Data2 = new java.util.ArrayList<>();
        Data2.add("Spane55");
        Data2.add("Spane54");
        Data2.add("Spane53");
        Data2.add("Spane52");
        Data.addAll(Data2);
        Data.add(1,"DumbleDore");
        Data.remove(String.valueOf("Snape3"));
        Data.forEach(System.out::println);

        for(int i=0;i<Data.size();i++){
            System.out.println(Data.get(i));
        }

        for(String datag : Data){
            System.out.println(datag);
        }
        Iterator<String> DataIte = Data.iterator();
        while(DataIte.hasNext()){
            System.out.println(DataIte.next());
        }
    }
}
