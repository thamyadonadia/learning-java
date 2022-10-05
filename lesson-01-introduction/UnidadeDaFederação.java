public class UnidadeDaFederação{
    private String nome;
    private String sigla;

    public UnidadeDaFederação(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    // método que manipula o nome da UF
    public String getNome(){
        return nome;
    }

    // método que manipula a sigla da UF
    public String getSigla(){
        return sigla;
    }
}