public class JogoTabuleiro extends Produto{
   private int idadeMinima;

    public JogoTabuleiro(String nome, double preço, int idadeMinima){
        super(nome, preço);
        this.idadeMinima = idadeMinima;
    }

    @Override
    public String toString(){
        return "Produto: Jogo de Tabuleiro\n" + super.toString() + "\n   Idade Mínima: " + idadeMinima + " anos";
    }
}
