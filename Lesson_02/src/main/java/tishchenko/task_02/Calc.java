package main.java.tishchenko.task_02;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        String Exit= " ";
        int FirstNumb;
        int SecondNumb;
        String Action;
        double SecondNumbDouble;
        while (!Exit.equals("n"))
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----===FirstCalc!===----");
            System.out.print("Enter FirstNumber: ");
            FirstNumb = scanner.nextInt();
            System.out.print("Enter Action(+,-,*,/)");
            Action = scanner.next();
            if (Action.equals("exit")){break;};
            System.out.print("Enter SecondNumber: ");
            SecondNumb = scanner.nextInt();
            SecondNumbDouble = (double)SecondNumb;
            if (Action.equals("+")){System.out.println("Result : " + (FirstNumb+SecondNumb));}
            else if (Action.equals("-")){System.out.println("Result : " + (FirstNumb-SecondNumb));}
            else if (Action.equals("*")){System.out.println("Result : " + (FirstNumb*SecondNumb));}
            else if (Action.equals("/")){System.out.println("Result : " + (FirstNumb/SecondNumbDouble));}
            else
                {System.out.println("Error - Enter Incorrect action! Please enter the correct action");}
            System.out.println("Сontinue?(Enter 'y' to continue, 'n' to Exit");
            Exit = scanner.next();
        }
    }
}
