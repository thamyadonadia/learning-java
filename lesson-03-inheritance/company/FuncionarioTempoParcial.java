public class FuncionarioTempoParcial extends Funcionario{
    private int numeroHorasSemanais;

    public FuncionarioTempoParcial(String nome, float salario, int numeroHorasSemanais){
        super(nome, salario); // reutiliza o construtor da superclasse "Funcionário"
        this.numeroHorasSemanais = numeroHorasSemanais;
    }

    @Override
    public int getNumeroHorasSemanais() {
        return numeroHorasSemanais;
    }

    public void setNumeroHorasSemanais(int numeroHorasSemanais) {
        this.numeroHorasSemanais = numeroHorasSemanais;
    }


    @Override
    public String toString() {
        return super.toString() + " - é funcionário de tempo parcial";
    }
}

/** "extends" - a classe FuncionárioTempoParcial herda os métodos da classe Funcionário
* a classe FuncionárioTempoParcial também pode apresentar métodos espéficos
*/