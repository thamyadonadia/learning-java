import java.util.*;
import java.text.*;

public class User{
    private String twitterId;
    private Set<Tweet> tweets = new HashSet<Tweet>();

    public User(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public Set<Tweet> getTweets() {
        return new HashSet<Tweet>(tweets);
    }

    public int getNumTweets(){
        return tweets.size();
    }

    public void addTweets(Tweet t){
        tweets.add(t);
    }

    public int getTamanhoTweets(){
        int  tamanhoTweets = 0;
        
        for(Tweet t : this.tweets){
            tamanhoTweets += t.getText().length();
        }
        return tamanhoTweets;
    }
}
