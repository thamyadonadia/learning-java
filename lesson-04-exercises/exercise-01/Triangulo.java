public class Triangulo {
    private Ponto p1, p2, p3;

    public Triangulo (Ponto p1, Ponto p2, Ponto p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public double getPerimetro(){
        double l1 = 0.0, l2 = 0.0, l3 = 0.0;

        l1 = p1.getDistancia(p2);
        l2 = p2.getDistancia(p3);
        l3 = p3.getDistancia(p1);

        return l1+l2+l3;
    }
}
