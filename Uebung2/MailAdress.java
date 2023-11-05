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

public final class MailList {
    private List<MailAdress> adresses;

    public MailList {
        adresses = new LinkedList<>();
    }
    public List addMailAdress (MailAdress adress) {
        adresses.add(adress)
    }
    public List getMailAdresses () {
        return adresses;
    }
}