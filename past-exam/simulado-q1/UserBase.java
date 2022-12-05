import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserBase {
    private Set<User> users  = new HashSet<>();

    public User createUser(String twitterId){
        User u = new User(twitterId);
        users.add(u);
        return u;
    }

    public VerifiedUser creatVerifiedUser(String twitterId, Date verificationDate){
        VerifiedUser v = new VerifiedUser(twitterId, verificationDate);
        users.add(v);
        return v;
    }

    public HashSet<User> getUsers(){
        return new HashSet<User>(users);
    }

    public double calculaPorcentagemUsuariosVerificados(){
        double totalVerificados = 0.0;

        for(User u : this.users){
            if(u instanceof VerifiedUser){
                totalVerificados++;
            }
        }

        return ((double) totalVerificados)/users.size();
    }

    public double calculaTamanhoMedioTweets(){
        int tamanhoTotalTweets = 0, numTotalTweets = 0;

        for(User u : this.users){
            tamanhoTotalTweets+=u.getTamanhoTotalTweets();
            numTotalTweets+=u.getNumeroTweets();
        }

        return ((double)tamanhoTotalTweets)/numTotalTweets;
    }
}
