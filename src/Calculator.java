import java.util.Scanner;

import com.vinicius_grandi.megasena.Checkout;

interface Print {
    void call(double um);
}

public class Calculator {
    public static double add(int a, int b) {
        return a + b;
    }

    public static double sub(int a, int b) {
        return a - b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("" +
                "What do you wanna do?\n" +
                "1)add\n" +
                "2)subtraction\n" +
                "3)division\n" +
                "4)multiply"
        );
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("Type the first and the second number");
        int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);

        System.out.println(Checkout.y);

        double result = switch (option) {
            case "1" -> add(firstNum, secondNum);
            case "2" -> sub(firstNum, secondNum);
            case "3" -> div(firstNum, secondNum);
            case "4" -> mul(firstNum, secondNum);
            default -> 0;
        };
        Print print = System.out::println;
        print.call(result);
    }
}
