package polinoamePrj;

public class Operations implements AllowedOperations{

    @Override
    public Polinom addition(Polinom p1, Polinom p2) {
        Polinom p3 = new Polinom();
        boolean[] wasAddedP1 = new boolean[p1.getPoli().size()];
        boolean[] wasAddedP2 = new boolean[p2.getPoli().size()];
        for(int i=0;i<p1.getPoli().size();i++){
            for(int j=0;j<p2.getPoli().size();j++){
                if(p1.getPoli().get(i).getDegree() == p2.getPoli().get(j).getDegree()){
                    p3.add(p1.getPoli().get(i).getCoefficient()+p2.getPoli().get(j).getCoefficient(),p1.getPoli().get(i).getDegree());
                    wasAddedP1[i] = true;
                    wasAddedP2[j] = true;
                }
            }

            if(!wasAddedP1[i])
                p3.add(p1.getPoli().get(i).getCoefficient(),p1.getPoli().get(i).getDegree());
        }

        for(int j=0;j<p2.getPoli().size();j++) {
            if(!wasAddedP2[j])
                p3.add(p2.getPoli().get(j).getCoefficient(),p2.getPoli().get(j).getDegree());
        }

        return p3;
    }

    @Override
    public Polinom substraction(Polinom p1, Polinom p2) {
        Polinom p3 = new Polinom();
        for(int j=0;j<p2.getPoli().size();j++) {
            p3.add(p2.getPoli().get(j).getCoefficient()*(-1),p2.getPoli().get(j).getDegree());
        }

        p3 = addition(p1,p3);

        return p3;
    }

    @Override
    public Polinom multiplication(Polinom p1, Polinom p2) {
        Polinom p3 = new Polinom();
        for(int i=0;i<p1.getPoli().size();i++){
            for(int j=0;j<p2.getPoli().size();j++){
                p3.add(p1.getPoli().get(i).getCoefficient()*p2.getPoli().get(j).getCoefficient(),p1.getPoli().get(i).getDegree()+p2.getPoli().get(j).getDegree());
            }
        }
        return p3;
    }

    @Override
    public Polinom derivare(Polinom p) {
        Polinom p3 = new Polinom();
        for(int i=0;i<p.getPoli().size();i++){
            if(p.getPoli().get(i).getDegree()!=0) {
                double coeff = p.getPoli().get(i).getCoefficient()*p.getPoli().get(i).getDegree();
                int degree = p.getPoli().get(i).getDegree()-1;
                p3.add(coeff,degree);
            }
        }
        return p3;
    }

}
