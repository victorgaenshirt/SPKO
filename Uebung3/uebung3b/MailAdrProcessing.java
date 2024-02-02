import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MailAdrProcessing {

    private List<String> storedAdresses = new ArrayList<>();
    private List<String> mailBacklog = new ArrayList<>();
    public MailAdrProcessing() {
        storedAdresses.add("chris@gmx.de");
        storedAdresses.add("selma@web.de");
        storedAdresses.add("victor@gmail.de");
    }
    public void adressProcessing(String mailAdr) {
        if (storedAdresses.contains(mailAdr)) {
            System.out.println("Mailadresse ist in der Datenbank vorhanden");
            sendMail(mailAdr);
        } else {
            mailBacklog.add(mailAdr);
            System.out.println("Mailadresse zur Collection hinzugefügt");
            System.out.println("Die Collection beinhaltet aktuell folgende Adressen:");
            for (String mail : mailBacklog) {
                System.out.println(mail);
            }
        }
    }
    public void sendMail(String mailAdr) {
        System.out.println("Mail wurde an " + mailAdr + " versendet");
    }
    public static void main(String[] args) {
        MailAdrProcessing mailAdrProcessing = new MailAdrProcessing();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine E-Mail-Adresse ein:");
        String inputMail = scanner.nextLine();

        mailAdrProcessing.adressProcessing(inputMail);
    }
}


