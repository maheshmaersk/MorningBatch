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


        Scanner acn = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String op1 = acn.next();
        System.out.println("Enter the Last Name");
        String op2 = acn.next();

        System.out.println("Entered name is "+op1.toUpperCase(Locale.ROOT)+" "+op2.toUpperCase(Locale.ROOT));


    }
}
