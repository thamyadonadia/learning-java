public class App {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("c1", 1000.0);
        ContaCorrenteEspecial c2 = new ContaCorrenteEspecial("c2", 1000.0);

        c1.sacar(100);
        c2.sacar(100);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());


    }   
}
