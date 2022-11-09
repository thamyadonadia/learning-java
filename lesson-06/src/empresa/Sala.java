package empresa;
import java.util.*;

public class Sala {
    private int numero;
    private Set<Funcionario> ocupantes = new HashSet<>();
    
    public Sala(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Set<Funcionario> getOcupantes(){
        return new HashSet<Funcionario>(ocupantes);
    }

    public void adicionaOcupante(Funcionario ocupante){
        this.ocupantes.add(ocupante);
        if(ocupante.getSalaOcupada()!=this){
            ocupante.setSalaOcupada(this);
        }
    }

    public void removeOcupante(Funcionario ocupante){
        ocupantes.remove(ocupante);
    }
  
    @Override
    public String toString(){
        return "\nOcupantes da sala: " + numero + getOcupantes();
    }
}
