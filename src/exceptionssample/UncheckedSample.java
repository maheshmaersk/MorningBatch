package exceptionssample;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UncheckedSample {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("item-1");
        lst.add("item-2");
        lst.add("item-3");

        String absd= "";
        try {
            System.out.println(lst.get(3));
        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Error OCcured");
        }

            absd =null;

//        System.out.println(absd.toUpperCase(Locale.ROOT));

        System.out.println("Hey I am last");





        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int integer = scanner.nextInt();
        System.out.println("Enter an 2nd integer: ");
        int sdfas = scanner.nextInt();
        scanner.close();
        int divi = integer/sdfas;

        System.out.println("You entered: " + integer);

    }
}
