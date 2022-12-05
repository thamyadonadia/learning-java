import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon>{
    private int pontosVitalidadeInicial, pontosVitalidadeAtual;
    private int danos[] = new int[2]; 

    public Pokemon(int pontosVitalidadeInicial, int danoMax, int danoMin){
        this.pontosVitalidadeInicial = pontosVitalidadeInicial;
        this.danos[0] = danoMin;
        this.danos[1] = danoMax;
        pontosVitalidadeAtual = pontosVitalidadeInicial;
    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        Random r = new Random();
        int ataque;
        
        if(r.nextBoolean()){
            ataque = personagemAtacado.getPontosVitalidade() - danos[1];
            personagemAtacado.atualizaPontosVitalidade(danos[1]);
        }else{
            ataque = personagemAtacado.getPontosVitalidade() - danos[0];
            personagemAtacado.atualizaPontosVitalidade(danos[0]);
        }
        
        if(ataque<0) return true;
        else return false;
    }

    @Override
    public void regenera() {
        pontosVitalidadeAtual = pontosVitalidadeInicial;        
    }

    @Override
    public int getPontosVitalidade() {
        return pontosVitalidadeAtual;
    }

    public void atualizaPontosVitalidade(int ataque){
        pontosVitalidadeAtual -= ataque;
    }

}
