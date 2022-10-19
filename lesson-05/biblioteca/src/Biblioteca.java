import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    Map<Integer, Livro> acervo = new HashMap<>();

    public void cadastrarLivros(Livro livro){    
        acervo.put(livro.getCodigo(), livro);
    }

    public void listarLivros(){
        for(Livro l: acervo.values()){
            System.out.println(l.getCodigo() + " - " + l.getTitulo());
        }   
    }

    //TODO: implementar a toString e colocar a função de impressão na main (função static)
    public void verDetalhes(int codigo){
        Livro l = acervo.get(codigo);
        System.out.println(l.getCodigo() + " - " + l.getTitulo());
        System.out.println("   Autor: " + l.getAutor());
        System.out.println("   Ano de Publicação: " + l.getAutor());
    }   

    public void removerLivros(int codigo){
        acervo.remove(codigo);
    }
}
