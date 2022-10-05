import java.util.LinkedList;

public class Empresa {
    private String nome;
    private LinkedList<Departamento> departamentos = new LinkedList<Departamento>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void addDepartamento(Departamento d){
        departamentos.addLast(d);
    }

    public boolean removeDepartamento(Departamento d){
        return departamentos.remove(d);
    }

    public int getNumeroDepartamentos(){
        return departamentos.size();
    }

    public LinkedList<Departamento> getDepartamentos(){
        return new LinkedList<Departamento>(departamentos);
    }

    public Departamento getDepartamento(int index){
        return departamentos.get(index);
    }

    public String getNome(){
        return nome;
    }

    public double getMediaSalarial(){
        double soma = 0.0; 
        int qtdFuncionarios = 0;

        for(Departamento d: this.getDepartamentos()){
            for(Funcionario f: d.getFuncionarios()){
                soma += f.getSalario();
            }
            
            qtdFuncionarios += d.getNumeroFuncionarios();
        }

        return soma / qtdFuncionarios;
    }


    public void aumentaSalario(float porcentagem){
        for(Departamento d: this.getDepartamentos()){
            d.aumentaSalario(porcentagem);
        }
    }

    @Override
    public String toString(){
        return "Empresa: " + nome;
    }
    
}