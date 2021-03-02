package polinoamePrj;

import java.util.Scanner;

public class Calculator {
    private static Operations operations = new Operations();
    public Polinom basicOperation(Polinom p1,Polinom p2){
        System.out.println("**************************************************");
        System.out.println("Insert what operation whould you like to perform with 2 polynomials:");
        System.out.println("You have the following options:");
        System.out.println("+ for addition");
        System.out.println("- for substraction");
        System.out.println("* for multiplication");
        System.out.println("' for derivation");
        System.out.println("Type any other symbol to exit");
        System.out.println("**************************************************");
        Scanner input = new Scanner(System.in);
        String op=input.next();
        Polinom p3 = null;
        switch(op){
            case "+":
                p3 = operations.addition(p1,p2);
                break;
            case "-":
                p3 = operations.substraction(p1, p2);
                break;
            case "*":
                p3 = operations.multiplication(p1,p2);
                break;
            case "'":
                System.out.println("What polinomial do you like to derivate?");
                System.out.println("First or second?");
                String answer = input.next();
                if(answer.equalsIgnoreCase("first")){
                    p3 = operations.derivare(p1);
                }
                else
                    p3 = operations.derivare(p2);
                break;
            default:
                Controller.flag = false;

        }
        return p3;
    }

}
