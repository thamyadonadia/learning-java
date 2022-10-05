public class Triangulo {
    private Ponto p1, p2, p3;

    public Triangulo (Ponto p1, Ponto p2, Ponto p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public double getPerimetro(){
        double l1 = 0.0, l2 = 0.0, l3 = 0.0;

        l1 = Math.sqrt(Math.pow((p2.getX() - p1.getX()),2) + Math.pow((p2.getY() - p1.getY()),2));
        l2 = Math.sqrt(Math.pow((p2.getX() - p3.getX()),2) + Math.pow((p2.getY() - p3.getY()),2));
        l3 = Math.sqrt(Math.pow((p3.getX() - p1.getX()),2) + Math.pow((p3.getY() - p1.getY()),2));

        return l1+l2+l3;
    }
}
