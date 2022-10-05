public class App{
    public static void imprime(Pilha p){
        for(String item: p.getItems()){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Pilha p1 = new Pilha();

        // adicionando elementos na pilha

        p1.empilha("a");
        p1.empilha("b");
        p1.empilha("c");
        p1.empilha("d");
        p1.empilha("e");
        p1.empilha("f");
        
        System.out.println("Pilha p1:");
        imprime(p1);

        // removendo dois elementos da pilha (últimos dois adicionados)
        p1.desempilha();
        p1.desempilha();

        System.out.println("\nRemovendo elementos da pilha p1:");
        imprime(p1);
    }
}