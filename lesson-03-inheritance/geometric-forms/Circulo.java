public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override // tag que indica que a função está sobrescrevendo outra da superclasse
    public double getPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Círculo:" + super.toString();
    }
}
