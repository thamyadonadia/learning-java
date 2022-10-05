public abstract class FormaGeometrica{

    public abstract double getPerimetro();
    public abstract double getArea();

    public String toString() {
        return "\n   Perímetro = " + String.format("%.2f",getPerimetro()) + "\n   Aŕea = " + String.format("%.2f",getArea()) + "\n";
    }
}

/** "abstract" - abstração dos métodos comuns dos dois tipos de funcionários
 * não pode instanciar diretamente funcionários dessa classe
 * todos os funcionários precisam ser de alguma subclasse da classe funcionário
 */