package polinoamePrj;


public class View {
    public void printPolinom(Polinom poli){
        System.out.print(poli.getPoli().get(0).getCoefficient()+"x^"+poli.getPoli().get(0).getDegree());
        for(int i=1;i< poli.getPoli().size();i++){
            String sign="";
            if(poli.getPoli().get(i).getCoefficient()>=0)
                sign="+";
            System.out.print(sign+poli.getPoli().get(i).getCoefficient()+"x^"+poli.getPoli().get(i).getDegree());
        }
        System.out.println();
    }
}
