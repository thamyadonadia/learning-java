import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon>{
    private int pontosVitalidade[] = new int[2]; 
    private int danos[] = new int[2];


    public Pokemon(int pontosVitalidade, int danos1, int danos2){
        this.pontosVitalidade[0] = pontosVitalidade;
        this.pontosVitalidade[1] = pontosVitalidade;
        this.danos[0] = danos1;
        this.danos[1] = danos2;
    }

    
    public boolean atacar(Pokemon personagemAtacado){
        Random r = new Random();
        int ataque = r.nextInt();
        
        while((ataque != danos[0]) && (ataque !=danos[1])){
            ataque = r.nextInt();
        }

        ataque = personagemAtacado.getPontosVitalidade() - ataque;

        if(personagemAtacado.getPontosVitalidade() == 0){
            return true;
        }else{
            return false;
        }

    }

    public void regenera(){
        this.pontosVitalidade[0] = this.pontosVitalidade[1];
    }


    public int getPontosVitalidade(){
        return pontosVitalidade[0];
    }
}
    
