package ooplab5;

import java.util.ArrayList;

public class myArraylist {
    public static  void  main(String[]args){
        //Arraylist
        ArrayList List = new ArrayList();
        String name = "kik"
                List.add(name);
        System.out.println(List);
        List.add("ploy");
        List.add("zee");
        System.out.println(List);
        List.add(index:2, element:"kik")
        System.out.println(List);
        List.add(1);
        System.out.println(List);
        List.add(10.10);
        System.out.println(List);
        List.remove(o: "ploy")
        System.out.println(List);
        List.remove( index: 3);
        System.out.println(List);
        System.out.println(List.size());
        System.out.println(List.get(2));
        System.out.println(List.indexOf("kik"));
    }//main
}//class