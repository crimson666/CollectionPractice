import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> Data= new ArrayList<>();
        Data.add("Snape");
        Data.add("Snape2");
        Data.add("Snape3");
        ArrayList<String> Data2 = new ArrayList<>();
        Data2.add("Spane55");
        Data2.add("Spane54");
        Data2.add("Spane53");
        Data2.add("Spane52");
        Data.addAll(Data2);
        Data.add(1,"DumbleDore");
        Data.remove(String.valueOf("Snape3"));
        Data.forEach(System.out::println);

//        for(int i=0;i<Data.size();i++){
//            System.out.println(Data.get(i));
//        }

        for(String datag : Data){
            System.out.println(datag);
        }
        Iterator<String> DataIte = Data.iterator();
        while(DataIte.hasNext()){
            System.out.println(DataIte.next());
        }

    }
}