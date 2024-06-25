import Collection.*;
import CoolStuff.CustomAnnotation;
import CoolStuff.colorEnums;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    @CustomAnnotation(value = 10)
    public void RanDomMethod(){
        System.out.println("Something coll must me going on");
    }
    public static void main(String[] args) throws NoSuchMethodException {
//        ArrayList2 ObjArrList = new ArrayList2();
//        Stack3 ObjStack = new Stack3();
//        LinedList2 ObjQueue = new LinedList2();
//        PriorityQueue2 ObjPriorityQueue = new PriorityQueue2();
//        ArrayDwdue2 ObjArrayDeque = new ArrayDwdue2();
//        HashSet2 ObjHashSet = new HashSet2();
//        SetAdvance objSetA = new SetAdvance();
//        TreeAdvance2 ObjTreeMap = new TreeAdvance2();
//        ArrayAdvance objArray = new ArrayAdvance();
//        collectionClass objCollection = new collectionClass();
//        objCollection.execute();

//        Enum Demo
//        colorEnums c = colorEnums.RED;
//        System.out.println("print " + c);
//        System.out.println("print " + c.name());
//        System.out.println("print " + c.getColor());
//        System.out.println("print " + c.values());

//        Custom Annotation
//        Main CusObj = new Main();
//        Method getMethod = CusObj.getClass().getMethod("RanDomMethod");
//        CustomAnnotation newCustomAnnotation = getMethod.getAnnotation(CustomAnnotation.class);
//        CustomAnnotation newCus = CusObj.getClass().getMethod("RanDomMethod").getAnnotation(CustomAnnotation.class);
//        System.out.println("Annotation Value is " + newCustomAnnotation.value() + " And " + newCus.value());




    }
}