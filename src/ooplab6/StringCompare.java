package ooplab6;

public class StringCompare {
    public static void main(String[]args){
        System str1="Hello";
        System str2="Hello";
        //compare String
        //type 1 (==)
        if (str1 == str2) System.out.println("true");
        else System.out.println("false");
        //type 2(equals() method)
        if (str1.equals(str2))System.out.println("ture");
        else System.out.println("false");
        //type 3 (compareTo() method)
        //0 = String is equal.
        //- = Left String is less than Right String
        //+ = Right String is more than Left String
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if(str1.compareTo(str2)>=1)
            System.out.println("str2 is more than str1");
        else
            System.out.println("str1 is less than str2");
    }//main
}//class

