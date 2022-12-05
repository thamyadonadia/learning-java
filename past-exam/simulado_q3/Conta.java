public class Conta {
    private String nomeCliente;
    private double saldoInicial;

    public Conta(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoInicial(){
        return saldoInicial;
    }
}
