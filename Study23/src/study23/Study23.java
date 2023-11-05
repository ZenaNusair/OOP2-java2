package study23;

import java.util.Scanner;

public class Study23 {

    public static void main(String[] args) {
        double number1, number2, result;
        char operator;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        number1 = input.nextDouble();

        System.out.println("Enter second number:");
        number2 = input.nextDouble();

        System.out.println("Choose an operator:1 for sum,2 for sub,3 for mul,4 for div:");
        operator = input.next().charAt(0);

        switch (operator) {

            case '1' -> {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }

            case '2' -> {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }

            case '3' -> {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }

            case '4' -> {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }

            default -> System.out.println("Invalid operator!");
        }
    }
}
