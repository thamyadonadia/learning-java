public class ContaCorrente extends Conta {
    private String nome;
    private double saldo;

    public ContaCorrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    @Override
    public void sacar(double quantia) {
        saldo -= quantia + (0.005 * quantia);
    }

    public double getSaldo() {
        return saldo;
    }
}