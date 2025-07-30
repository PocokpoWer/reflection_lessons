import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Set;

public class EmailManagerTest {
    @Test
    void shouldGetEmailList() {
        EmailManager emailManager = new EmailManager();
        emailManager.addEmail("farkas.tibor1105@gmail.com");
        emailManager.addEmail("liludallas@gmail.com");
        Set<String> emails = emailManager.getEmailList();
        assertTrue(emails.contains("farkas.tibor1105@gmail.com"));
        assertTrue(emails.contains("liludallas@gmail.com"));
    }
}
