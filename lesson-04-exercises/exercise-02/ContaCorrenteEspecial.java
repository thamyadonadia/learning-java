public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome, Double saldo) {
        super(nome, saldo);
        this.tipo = "Cliente Especial";
    }

    @Override
    public Boolean sacar(double quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia + (0.001 * quantia);
            return true;
        } else {
            return false;
        }
    }
}