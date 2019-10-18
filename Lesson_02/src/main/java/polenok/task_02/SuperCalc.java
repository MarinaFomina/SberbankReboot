package main.java.polenok.task_02;

import java.util.Scanner;

public class SuperCalc {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first num: ");
            double first = scanner.nextDouble();

            System.out.print("Input action (+,-,/,*,%,exit): ");
            String action = scanner.next();

            if (action.equals("exit")){
                break;
            }

            System.out.print("Input second num: ");
            double second = scanner.nextDouble();

            switch (action) {
                case ("+"):
                    System.out.println(first + "+" + second + "=" + (first + second));
                    break;
                case ("-"):
                    System.out.println(first + "-" + second + "=" + (first - second));
                    break;
                case ("*"):
                    System.out.println(first + "*" + second + "=" + (first * second));
                    break;
                case ("/"):
                    System.out.println(first + "/" + second + "=" + (first / second));
                    break;
                case ("%"):
                    System.out.println(first + "%" + second + "=" + (first % second));
                    break;
                default:
                    System.out.println("Unknoun action");
                    break;
            }
        }
    }
}
