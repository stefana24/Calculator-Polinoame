package polinoamePrj;

import java.util.Scanner;

public class Controller {
   private static Calculator calculator = new Calculator();
    private Polinom p1;
    private Polinom p2;
    private View viewPolinom;

    public static boolean flag = true;

    public Controller(){
        System.out.print("Cate monoame va contine polinomul1? ");
        Scanner input = new Scanner(System.in);
        int nrMonoameP1 = input.nextInt();
        Polinom p1 = new Polinom(nrMonoameP1);
        viewPolinom = new View();
        viewPolinom.printPolinom(p1);

        System.out.print("\nCate monoame va contine polinomul2? ");
        int nrMonoameP2 = input.nextInt();
        Polinom p2 = new Polinom(nrMonoameP2);
        viewPolinom = new View();
        viewPolinom.printPolinom(p2);

        while(flag){
            Polinom p3 = calculator.basicOperation(p1,p2);
            if(p3!=null){
                System.out.print("Result: ");
                viewPolinom = new View();
                viewPolinom.printPolinom(p3);
            }

        }

    }
}
