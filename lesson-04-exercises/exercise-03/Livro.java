public class Livro extends Produto{
    private String autor;

    public Livro(String nome, String autor, double preço){
        super(nome, preço);
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Produto: Livro\n" + super.toString() + "\n   Autor: " + autor;
    }
}
