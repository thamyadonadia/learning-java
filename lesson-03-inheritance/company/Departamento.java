import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();

    public Departamento(String nome){
        this.nome = nome;
    }

    public void addFuncionario(Funcionario f){
        funcionarios.addLast(f);
    }

    public boolean removeFuncionario(Funcionario f){
        return funcionarios.remove(f);
    }

    public int getNumeroFuncionarios(){
        return funcionarios.size();
    }
    
    public LinkedList<Funcionario> getFuncionarios(){
        return new LinkedList<Funcionario>(funcionarios);
    }

    public String getNome() {
        return nome;
    }

    public double getMediaSalarial(){
        double soma = 0.0;

        for(Funcionario f: this.getFuncionarios()){
            soma += f.getSalario();
        }


        return soma/ funcionarios.size();
    }
    
    public void aumentaSalario(float porcentagem){
        for(Funcionario f: this.getFuncionarios()){
            f.aumentarSalario(porcentagem);
        }
    }

    @Override
    public String toString(){
        return "\nDepartamento: " + getNome() + "\n" + "   Salário médio: R$" + getMediaSalarial() + "\n";
    }
}   
