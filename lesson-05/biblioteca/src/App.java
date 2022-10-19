import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca acervo = new Biblioteca();
    
        Scanner sc = new Scanner(System.in);

        System.out.println("---------- Biblioteca ----------");
        System.out.println("Escolha uma das operações abaixo:\n" + "1. Cadastrar um novo livro\n2. Listar livros atuais");
        System.out.println("3. Ver detalhes de algum livro\n4. Remover algum livro\n5. Finalizar as operações\n");

        int op = 0;
       

        while(op!=5){
            op = Integer.parseInt(sc.nextLine());

            if(op == 5){
                break;
            }

            switch (op){
                case 1:
                    System.out.println("Cadastro de livros");
                    System.out.println("Digite as seguinte informações do livro em sequência: código, título, autor e ano de publicação");   
                    
                    System.out.print("Digite o código livro: ");
                    int codigo = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Digite o título do livro: ");
                    String titulo = sc.nextLine();
                    
                    System.out.print("Digite o autor do livro: ");
                    String autor = sc.nextLine();

                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicação = Integer.parseInt(sc.nextLine());
                        
                    Livro novoLivro = new Livro(codigo, anoPublicação, titulo, autor);
    
                    acervo.cadastrarLivros(novoLivro);
                    System.out.print("Livro cadastrado com sucesso!\n");
                    break;
                
                case 2:
                    System.out.println("Listagem de livros");
                    acervo.listarLivros();
                    break;
                
                case 3:
                    System.out.println("Visualizar detalhes de um livro");
                    acervo.listarLivros();;
                    System.out.print("\nDigite o código do livro a ser detalhado: ");
                    codigo = Integer.parseInt(sc.nextLine());
                    acervo.verDetalhes(codigo);
                    break;
                
                case 4:
                    System.out.println("Remoção de livros");
                    acervo.listarLivros();
                    System.out.print("\nDigite o código do livro a ser removido: ");
                    codigo = Integer.parseInt(sc.nextLine());
                    acervo.removerLivros(codigo);
                    break;
           
            }       

        
        }
        sc.close();        
    }
}

