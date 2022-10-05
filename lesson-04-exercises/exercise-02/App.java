public class App {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Cliente 1", 1000.0);
        ContaCorrenteEspecial c2 = new ContaCorrenteEspecial("Cliente 2", 1000.0);

        System.out.println(c1.getNome() + " (" + c1.getTipo() + ") :\n" + "   Saldo atual: R$" + c1.getSaldo());
        System.out.println(c2.getNome() + " (" + c2.getTipo() + ") :\n" + "   Saldo atual: R$" + c2.getSaldo());

        System.out.println("\n---------- Realizando o saque nas contas ---------- ");

        if (c1.sacar(100)) {
            System.out.println(c1.getNome() + " (" + c1.getTipo() + "):\n" + "   Saldo atual: R$" + c1.getSaldo());
        } else {
            System.out.println(c1.getNome() + " (" + c1.getTipo() + "):\n" + "   Saldo insuficiente para realizar o saque!");
        }

        if (c2.sacar(100)) {
            System.out.println(c2.getNome() + " (" + c2.getTipo() + "):\n" + "   Saldo atual: R$" + c2.getSaldo());
        } else {
            System.out.println(c2.getNome() + " (" + c2.getTipo() + "):\n" + "   Saldo insuficiente para realizar o saque!");
        }

        System.out.println("\n---------- Realizando o depósito nas contas ---------- ");
        c1.depositar(100);
        c2.depositar(100);

        System.out.println(c1.getNome() + " (" + c1.getTipo() + "):\n" + "   Saldo atual: R$" + c1.getSaldo());
        System.out.println(c2.getNome() + " (" + c2.getTipo() + "):\n" + "   Saldo atual: R$" + c2.getSaldo());

        System.out.println("\n---------- Realizando o saque nas contas ---------- ");

        if (c1.sacar(1000)) {
            System.out.println(c1.getNome() + " (" + c1.getTipo() + "):\n" + "   Saldo atual: R$" + c1.getSaldo());
        } else {
            System.out.println(c2.getNome() + " (" + c2.getTipo() + "):\n" + "   Saldo insuficiente para realizar o saque!");
        }

        if (c2.sacar(300)) {
            System.out.println(c2.getNome() + " (" + c2.getTipo() + "):\n" + "   Saldo atual: R$" + c2.getSaldo());
        } else {
            System.out.println(c2.getNome() + " (" + c2.getTipo() + "):\n" + "   Saldo insuficiente para realizar o saque!");
        }

    }
}
