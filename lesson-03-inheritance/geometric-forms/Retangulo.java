public class Retangulo extends FormaGeometrica {
    private double largura, comprimento;

    public Retangulo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override // tag que indica que a função está sobrescrevendo outra da superclasse
    public double getPerimetro(){
        return ((2*largura) + (2*comprimento));
    }

    @Override
    public double getArea(){
        return largura*comprimento;
    }   

    @Override
    public String toString() {
        return "Retângulo:" + super.toString();
    }
}   
