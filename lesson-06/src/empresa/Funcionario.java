package empresa;

public class Funcionario {
    private String nome;
    private Double salario;
    private Sala salaOcupada;


    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setSalaOcupada(Sala salaOcupada) {
        if(this.salaOcupada!=null){
            this.salaOcupada.removeOcupante(this);
        }

        if(!salaOcupada.getOcupantes().contains(this)){
            salaOcupada.adicionaOcupante(this); 
        }
        this.salaOcupada = salaOcupada;  

        /* TODO: 
         * rodar apenas com a função salaOcupada.setOcupante(this) com o seguinte comando:
         * java -cp bin App 2> erro.log
         */
    }

    public Sala getSalaOcupada() {
        return salaOcupada;
    }

    @Override
    public String toString(){
        return nome;  
    }
}

