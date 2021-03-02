package polinoamePrj;

import java.util.ArrayList;
import java.util.Scanner;

public class Polinom {
    private ArrayList<Monom> poli;

    public Polinom(int nrMonoame){
        poli = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<nrMonoame;i++){
            System.out.print("Introduceti coeficientul "+(i+1)+": ");
            double coef = input.nextDouble();
            System.out.print("Introduceti gradul monomului "+(i+1)+": ");
            int degree = input.nextInt();

            Monom m = new Monom(coef,degree);
            poli.add(m);
        }
    }

    public Polinom(){
        poli = new ArrayList<>();
    }
    public void add(double coef1,int degree){
        poli.add(new Monom(coef1,degree));
    }
    public ArrayList<Monom> getPoli() {
        return poli;
    }

}
