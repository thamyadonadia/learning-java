import java.util.*;

public class Agencia {
    private String nomeAgencia;
    private Set<Conta> contas = new HashSet<>();

    public String getNomeAgencia(){
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia){
        this.nomeAgencia = nomeAgencia;
    }
    
    public void adicionaConta(Conta c){
        contas.add(c);
    }

    public double getSaldoMedio(){
        double totalContas = contas.size();
        double saldoTotal = 0.0;
        
        for(Conta c : this.contas){
            saldoTotal += c.getSaldoInicial();
        }

        return (saldoTotal / totalContas);
    }
}
