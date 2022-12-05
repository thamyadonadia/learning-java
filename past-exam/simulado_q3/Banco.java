import java.util.*;

public class Banco {
    private String nomeBanco;
    private Agencia a;

    public Banco(String nomeBanco){
        this.nomeBanco = nomeBanco;
    }

    public Agencia criaAgencia(String nomeAgencia){
        a = new Agencia();
        a.setNomeAgencia(nomeAgencia);
        return a;
    }

    @Override
    public String toString(){
        return "Nome do Banco: " + nomeBanco + "\n" + "Agência: " + a.getNomeAgencia()  + ", saldo médio: " + a.getSaldoMedio(); 
    }
}
