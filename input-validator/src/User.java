public class User {
    private String username;
    private String email;
    private String comment;

    public User(String username, String email, String comment) {
        this.username = username;
        this.email = email;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Email: %s, Comment: %s\n",username,email,comment);
    }
}
