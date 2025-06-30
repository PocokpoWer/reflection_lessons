public class User {
    String username;
    String email;
    String comment;

    public User(String username, String email, String comment) {
        this.username = username;
        this.email = email;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return username + " , " + email + " , " + comment;
    }
}
