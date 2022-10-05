public class FuncionarioTempoIntegral extends Funcionario {
    public FuncionarioTempoIntegral(String nome, float salario){
        super(nome, salario);
    }   

    @Override
    public String toString() {
        return super.toString() + " - é funcionário de tempo integral";
    }
}

/** "extends" - a classe FuncionárioTempoIntegral herda os métodos da classe Funcionário
* a classe FuncionárioTempoIntegral também pode apresentar métodos espéficos
*/
