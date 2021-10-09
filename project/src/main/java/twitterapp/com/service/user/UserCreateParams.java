package twitterapp.com.service.user;

import javax.persistence.Column;
import java.sql.Time;
import java.sql.Timestamp;

public class UserCreateParams {

    private String name;
    private String email;
    private String password;
    private Timestamp date_of_birth;

    public UserCreateParams(String name, String email, String password, Timestamp date_of_birth) {
        if (name == null) {
            throw new IllegalArgumentException("Name should not be null");
        }
        if (email == null) {
            throw new IllegalArgumentException("Email should not be null");
        }
        if (password == null) {
            throw new IllegalArgumentException("Password should not be null");
        }
        this.name = name;
        this.email = email;
        this.password = password;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Timestamp date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
