public class Cidade {
    private String nome;
    private String sigla;
    private UnidadeDaFederação uf;

    public Cidade(String nome, String sigla, UnidadeDaFederação uf){
        this.nome = nome;
        this.sigla = sigla;
        this.uf = uf;
    }

    // método que manipula o nome da cidade
    public String getNome() {
        return nome;
    }

    // método que manipula a sigla da cidade
    public String getSigla() {
        return sigla;
    }

    // método que manipula a UF da cidade
    public UnidadeDaFederação getUF(){
        return uf;
    }


}
