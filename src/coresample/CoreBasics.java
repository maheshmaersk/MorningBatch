package coresample;

import java.util.Scanner;

public class CoreBasics {

    String projectName = " Harsha";

    public static void main(String[] args) {


        int a = 10;
        int b = 134;

        System.out.println(a + b);

        CoreBasics obj = new CoreBasics();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter\n'A' For Addition\n'M' for Multiplication\n'S' for Substraction\n'D' for Division");
        String calType = scanner.nextLine();
        System.out.println("Enter the First Number");
        int firstInput = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int secondInput = scanner.nextInt();

        if (calType.equalsIgnoreCase("a")) {
           int khjgfgdhj= obj.add(firstInput, secondInput);
        } else if (calType.equalsIgnoreCase("m")) {
            obj.multiply(firstInput, secondInput);
        } else if (calType.equalsIgnoreCase("s")) {
            obj.subtract(firstInput, secondInput);
        } else if (calType.equalsIgnoreCase("d")) {
            obj.division(firstInput, secondInput);
        } else {
            System.out.println("Invalid Type");
        }

    }


    private int add(int a, int b) {
        System.out.println("Addition output is " + (a + b));
        return a+b;
    }

    protected void multiply(int a, int b) {
        System.out.println("Multiply output is " + (a * b));
    }

    public void subtract(int a, int b) {
        System.out.println("Substract output is " + (a - b));
    }

    void division(int a, int b) {
        System.out.println("division output is " + (a / b));
    }
}
