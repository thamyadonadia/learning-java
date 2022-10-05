public class ContaCorrenteEspecial extends Conta {
    private String nome;
    private Double saldo;

    public ContaCorrenteEspecial(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double quantia) {
        saldo += quantia;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double quantia) {
        saldo -= quantia + (0.001 * quantia);
    }
}