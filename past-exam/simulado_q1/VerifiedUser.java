import java.time.*;
import java.util.*;

public class VerifiedUser extends User {
    private LocalDate verificationDate;

    public VerifiedUser(String twitterId, String verificationDate) {
        super(twitterId);
        this.verificationDate = LocalDate.parse(verificationDate);
    } 

}
