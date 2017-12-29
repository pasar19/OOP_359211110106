package ooplab6;

public class myString {
    public static void main(String[] args) {
        char[] c = {'H','e','l','l','o'};
        String str1 = new String(c);
        System.out.println(str1);

        String str2 = "Pasar Uttamang";
        System.out.println(str2);



        String str3 = new String( "RMUSTSV");
        System.out.println(str3);
        //concatenation String
        //type (+)
        String str4 = str1 +" "+ str2;
        System.out.print(str4);
        //type (concat() method)
        String str5 = str1.concat(" "+str3);
        System.out.println(str5);

        //String size
        int length = str4.length();
        System.out.println(length);
        System.out.println(str5.length());

        //String method
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toUpperCase());
        System.out.println(str5.replace( 'l','s');

        //trim()
        String str6 = "Hello";
        System.out.print(str6.length());
        System.out.print("+"+str6+"*");
        System.out.print("+"+str6.trim()+"*");


    }//main
}//class


