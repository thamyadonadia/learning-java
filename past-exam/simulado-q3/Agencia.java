import java.util.HashSet;
import java.util.Set;

public class Agencia {
    private String nomeAgencia;
    private Set<Conta> contas = new HashSet<>();

    public Agencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public void adicionaConta(Conta conta) {
        contas.add(conta);
    }

    public double getSaldoMedio(){
        double saldoTotal = 0.0;

        for(Conta c: this.contas){
            saldoTotal += c.getSaldoInicial();
        }

        return saldoTotal/contas.size();
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }
}
