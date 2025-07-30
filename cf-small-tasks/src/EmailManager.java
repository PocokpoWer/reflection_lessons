import java.util.LinkedHashSet;
import java.util.Set;

public class EmailManager {
    // Task 7:
    private Set<String> emails = new LinkedHashSet<>();

    void addEmail(String email) {
        emails.add(email);
    }

    Set<String> getEmailList() {
        return emails;
    }

    void updateEmail(String oldEmail, String updatedEmail) {
        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(updatedEmail);
        } else {
            System.out.printf("Email not found %s\n", oldEmail);
        }
    }

    void deleteEmail(String email) {
        if (!emails.remove(email)) {
            System.out.printf("Email not found %s%n\n", email);
        }
    }
}
