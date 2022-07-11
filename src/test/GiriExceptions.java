package test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class GiriExceptions {

    public static void main(String[] args) {
        String name = "null sadas";
        try {
            System.out.println(name.substring(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
        }finally {
            System.out.println("Hello");
        }
        System.out.println("I think this will execute");

        try {
            FileReader fileReader = new FileReader("harsha.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
