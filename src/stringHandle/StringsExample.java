package stringHandle;

import java.util.Locale;
import java.util.Scanner;

public class StringsExample {

    public static void main(String[] args) {

//
//        String a = "Mahesh";
//        String b = "Mahesh";
//
//        String c = new String("MaHesH");
//        String d = new String("Anil");
//
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(c));

//
//        Scanner acn = new Scanner(System.in);
//        System.out.println("Enter the First Name");
//        String op1 = acn.next();
//        System.out.println("Enter the Last Name");
//        String op2 = acn.next();
//
//        System.out.println("Entered name is "+op1.toUpperCase(Locale.ROOT)+" "+op2.toUpperCase(Locale.ROOT));
//        System.out.println("Entered name is "+op1.toLowerCase(Locale.ROOT)+" "+op2.toLowerCase(Locale.ROOT));

        String ans = "This is just a warning and need to see how it works";
        String ans1 = "023-34554545";

        String[] sdd = ans.split(" ");
//        for (String sdas:sdd) {
//            System.out.println(sdas);
//        }
        System.out.println(sdd.length);

        for (int i = sdd.length-1; i >= 0; i--) {
            System.out.print(sdd[i]+" ");
        }
        System.out.println();
        System.out.println(ans.substring(10));


        String asmd = " Sankeeth      ";

        System.out.println("Length of String "+asmd.trim().length());

        System.out.println(asmd.trim().startsWith("Sa"));
        System.out.println(asmd.trim().endsWith("th"));
        System.out.println(asmd.trim().indexOf("th"));
        System.out.println(asmd.trim().contains("t"));

    }
}
