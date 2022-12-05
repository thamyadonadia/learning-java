import java.util.Date;

public class VerifiedUser extends User{
    private Date verificationDate;

    public VerifiedUser(String twitterId, Date verificationDate){
        super(twitterId);
        this.verificationDate = verificationDate;
    }
}
