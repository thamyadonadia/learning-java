public abstract class Produto {
    private String nome;
    private double preço;

    public Produto(String nome, double preço){
        this.nome = nome;
        this.preço = preço;
    }

    @Override
    public String toString(){
        return "   Nome: " + nome + "\n   Preço: R$" + preço;
    }
}   
