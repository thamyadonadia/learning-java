public class Ponto{
    private double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getDistancia(Ponto p){
        return  Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
    }
}