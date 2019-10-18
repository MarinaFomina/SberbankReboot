package melnikov;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

interface IFunction {
    public double execute(double a, double b);
}

public class Task_2_1 {

    static Map<String, IFunction> op = new HashMap<String, IFunction>();

    static private double getNextValue(Scanner in)
    {
       while (true) {
           try {
               return in.nextDouble();
           } catch (InputMismatchException e) {
               in.next();
               System.out.println("Wrong number, please retry");
               continue;
           }
       }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        op.put("+",  new IFunction() {
                   public double execute(double a, double b)
                   {
                       return a + b;
                   }
               });

        op.put("-",  new IFunction() {
            public double execute(double a, double b)
            {
                return a - b;
            }
        });

        op.put("*",  new IFunction() {
            public double execute(double a, double b)
            {
                return a * b;
            }
        });

        op.put("/",  new IFunction() {
            public double execute(double a, double b)
            {
                return a / b;
            }
        });

        op.put("%",  new IFunction() {
            public double execute(double a, double b)
            {
                return a % b;
            }
        });

        System.out.println ("Hello human! I am Java console calculator");
        System.out.println ("I have commands:");
        System.out.println (" + = add numbers");
        System.out.println (" - = sub numbers");
        System.out.println (" * = mul numbers");
        System.out.println (" / = mul numbers");
        System.out.println (" % = mod numbers");

        while (true) {
            String cmd;
            double a, b;

            System.out.println("Please enter first number");

            a = getNextValue(in);

            System.out.println("Please enter operation");

            while (true) {
                cmd = in.next();
                if ( op.containsKey(cmd) ) break;
                System.out.println("Wrong operation, please retry");
            }

            System.out.println ("Please enter second number");
            b = getNextValue(in);

            double v = op.get(cmd).execute(a, b);
            double diff = (double)(int)v - v;

            if (diff == 0)
                System.out.println ( (int)v );
            else
                System.out.println ( v );

            System.out.println ("Do you want to exit? (y/n)");
            String exit = in.next();

            if (exit.equals("y")) break;
        }
     }
}
