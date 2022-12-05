import java.util.HashSet;
import java.util.Set;

public class User {
    private String twitterId;
    private Set<Tweet> tweets = new HashSet<>();

    public User(String twitterId){
        this.twitterId  = twitterId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public HashSet<Tweet> getTweets() {
        return new HashSet<Tweet>(tweets);
    }
    
    public int getTamanhoTotalTweets(){
        int tamanhoTotalTweets = 0;

        for(Tweet t: this.tweets){
            tamanhoTotalTweets += t.getText().length();
        }

        return tamanhoTotalTweets;
    }

    public int getNumeroTweets(){
        return tweets.size();
    }

    public Tweet criaTweet(String text){
        Tweet t = new Tweet(text);
        tweets.add(t);
        return t;
    }
}
