package sample;

import javafx.collections.ObservableArray;

public class User {
    private String login;
    private String fullName;
    private String email;

    public User(String login, String fullName, String email) {
        this.login = login;
        this.fullName = fullName;
        this.email = email;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
