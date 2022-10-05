public class Time{
    private String nome;
    private Cidade cidadeSede;

    public Time(String nome, Cidade cidadeSede) {
        this.nome = nome;
        this.cidadeSede = cidadeSede;
    }

    // métodos que manipulam o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // métodos que manipulam o atributo cidade sede
    public Cidade getCidadeSede() {
        return cidadeSede;
    }

    public void setCidadeSede(Cidade cidadeSede) {
        this.cidadeSede = cidadeSede;
    }
}