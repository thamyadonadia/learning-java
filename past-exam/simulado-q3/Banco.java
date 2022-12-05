import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nomeBanco;
    private Set<Agencia> agencias = new HashSet<>();

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia a = new Agencia(nomeAgencia);
        agencias.add(a);
        return a;
    }

    @Override
    public String toString(){
        String resultado = "Nome do Banco: " + nomeBanco + "\n";

        for(Agencia a: this.agencias){
            resultado += "Agência: " + a.getNomeAgencia() + ", saldo médio: " + a.getSaldoMedio() + "\n";
        }

        return resultado;
    }

}
