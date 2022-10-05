public class Triangulo extends FormaGeometrica{
    private double lado1, lado2, lado3;
    
    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override // tag que indica que a função está sobrescrevendo outra da superclasse
    public double getPerimetro(){
        return (lado1 + lado2 + lado3);
    }

    @Override 
    public double getArea(){
        // fórmula de Heron: forma genérica de calcular a área de um triângulo
        double semiPerimetro = getPerimetro()/2;
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
        return area;
    }

    @Override
    public String toString() {
        return "Triângulo:" + super.toString();
    }
    
}
