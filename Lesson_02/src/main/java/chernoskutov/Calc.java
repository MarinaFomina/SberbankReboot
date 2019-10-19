package main.java.chernoskutov;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== The program calculate ===");
        while (true){
                System.out.println("To text 2 mun and select mathematics operation( + , -, / or *): ");
                System.out.println("type first num:");
                double p1 = sc.nextDouble();
                System.out.println("type second num:");
                double p2 = sc.nextDouble();
                System.out.println("select operation( + , -, / or *):");
                String oper = sc.next();
                System.out.println("Result: ");
                System.out.println(calcExecutor(p1,p2,oper) + "\n----------NEXT---------------");
        }
    }
    private static double calcExecutor(double p1, double p2, String oper){
        if(oper.equals("+")) { return p1 + p2; }
        else if(oper.equals("-")){ return p1 - p2; }
        else if(oper.equals("/")){ if(p2 == 0) {System.out.print("division by zero! "); } return p1 / p2; }
        else if(oper.equals("*")){ return p1 * p2; }
        return 0;
    }
}
