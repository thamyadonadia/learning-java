import java.text.NumberFormat;
import java.util.*;
import java.text.*;

public class UserBase{
    private List<User> users = new LinkedList<User>();

    public LinkedList<User> getUsers() {
        return new LinkedList<User>(users);
    }

    public void addUser(User u){
        users.add(u);
    }

    public String getPorcentagemMediaVerifiedUser(){
        NumberFormat nf = NumberFormat.getPercentInstance(Locale.forLanguageTag("pt-BR"));
        double totalUsuarios, totalUsuariosVerificados = 0.0, porcentagem;

        totalUsuarios = users.size();
        for(User u : this.users){
            if(u instanceof VerifiedUser){
                totalUsuariosVerificados++;
            }
        }

        porcentagem = totalUsuariosVerificados / totalUsuarios;
        return nf.format(porcentagem);
    }

    public String getTamanhoMedioTweets(){
        NumberFormat nf = NumberFormat.getInstance(Locale.forLanguageTag("pt-BR"));
        double totalTweets = 0.0, tamanhoMedio, totalTamanho= 0.0;
        
        for(User u : this.users){
            totalTamanho += u.getTamanhoTweets();
            totalTweets += u.getNumTweets();
        }
        
        tamanhoMedio =  totalTamanho / totalTweets;
        return nf.format(tamanhoMedio);
    }
}



