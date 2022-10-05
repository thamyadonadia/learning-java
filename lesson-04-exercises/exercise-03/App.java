import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // criação da lista de produtos
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        // criação dos produtos: livros e jogos de tabuleiro
        Livro livro1 = new Livro("A Odisseia", "Homero", 50);
        Livro livro2 = new Livro("Orgulho e Preconceito", "Jane Austen", 45);
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 40);
        JogoTabuleiro jogo1 = new JogoTabuleiro("Banco Imobiliário", 100, 8);
        JogoTabuleiro jogo2 = new JogoTabuleiro("Detetive", 80, 8);

        // adição dos produtos à lista
        produtos.add(livro1);
        produtos.add(livro2);
        produtos.add(livro3);
        produtos.add(jogo1);
        produtos.add(jogo2);

        // impressão dos produtos da loja
        for(Produto f: produtos){
            System.out.println(f.toString() + "\n");
        }
        
    }
}
