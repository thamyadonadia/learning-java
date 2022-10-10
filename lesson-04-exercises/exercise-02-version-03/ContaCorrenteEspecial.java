public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome, Double saldo) {
        super(nome, saldo);
        this.tipo = "Cliente Especial";
    }

    @Override
    public double getTaxa(){
        return 0.01;
    }
}