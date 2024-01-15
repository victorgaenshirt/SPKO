import java.util.LinkedList;
import java.util.List;

public final class MailAdress {
    private String user;
    private String domain;
    private String ending;

    public MailAdress(String user, String domain, String ending) {
        this.user = user;
        this.domain = domain;
        this.ending = ending;
    }

    public String getUser() {
        return user;
    }
    public String getDomain() {
        return domain;
    }
    public String getEnding() {
        return ending;
    }
}
