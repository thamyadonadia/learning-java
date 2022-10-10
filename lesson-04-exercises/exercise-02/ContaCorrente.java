public class ContaCorrente {
    private String nome;
    protected double saldo;
    protected String tipo;

    public ContaCorrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = "Cliente Normal";
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public Boolean sacar(double quantia) {
        if (saldo >= quantia) {
            saldo -= quantia + (0.05 * quantia);
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }
}