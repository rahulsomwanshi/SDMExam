import java.util.Scanner;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, option, ex;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Add");
            System.out.println("2 .Substract");
            System.out.println("3. Multiply");
            System.out.println("Divide");
            System.out.println("Enter Your Choice: ");
            option = sc.nextInt();
            if (option != 5) {
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();

            } else {
                break;
            }

            switch (option) {
                case 1:
                    System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Substraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid input");

            }
            System.out.println("Do you want to continue: ");
            ex = sc.nextInt();

        } while (ex == 1);

    }
}