package CoolStuff;

public class GenericsStuff <T,U>{
    T obj1;
    U obj2;
    public GenericsStuff(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void getStuff(){
        System.out.println("Have " + obj2 + " " + obj1 + " times a day," + obj1);
    }

    public U getObj2(){
        return obj2;
    }

    public T getObj1(){
        return obj1;
    }

}

class A{
    public static void main(String[] a){
        GenericsStuff<Integer,String> ThingsToDo= new GenericsStuff<>(20,"Sex");
        ThingsToDo.getStuff();
    }
}
