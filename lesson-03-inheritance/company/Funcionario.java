public abstract class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    /** aumenta o salaŕio usando uma porcentagem de acréscimo ao salário atual
     * @param porcentagem - porcentagem expressa como uma fração (ex: 10% = 0.1f)
     */
    public void aumentarSalario(float porcentagem){
        this.salario = salario * (1.0f + porcentagem);
    }


    public int getNumeroHorasSemanais() {
        return 40;
    }

    @Override
    public String toString(){
        return "     " + getNome() + " - R$" + getSalario() + " - trabalha " + getNumeroHorasSemanais() + "h";
    }
}
   
