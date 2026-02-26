package Lexicon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {

            System.out.println("Choose: + - * / or exit");
            String op = sc.next();

            if(op.equalsIgnoreCase("exit")){
                run = false;
                break;
            }

            System.out.print("First number: ");
            double a = sc.nextDouble();

            System.out.print("Second number: ");
            double b = sc.nextDouble();

            double result = 0;

            if(op.equals("+")){
                result = a + b;
            } else if(op.equals("-")){
                result = a - b;
            } else if(op.equals("*")){
                result = a * b;
            }  else if(op.equals("/")){
                if(b == 0){
                    System.out.println("Cannot divide by zero");
                    continue;
                }
                result = a / b;
            } else {
                System.out.println("Invalid operator");
                continue;
            }

            System.out.println("Result = " + result);

            System.out.println("Again? yes/no");
            String again = sc.next();
            if(!again.equalsIgnoreCase("yes")){
                run = false;
            }
        }
        sc.close();
    }
}