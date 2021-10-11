package twitterapp.com.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator")
    @SequenceGenerator(name = "my_generator", sequenceName = "users_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "date_of_birth")
    private Timestamp dateOfBirth;

    public Users() {
    }

    public Users(String name, String email, String password, Timestamp date_of_birth) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = date_of_birth;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", date_of_birth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;
        return new EqualsBuilder().append(id, users.id).append(name, users.name).append(password, users.password).append(email, users.email).append(dateOfBirth, users.dateOfBirth).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(name).append(password).append(email).append(dateOfBirth).toHashCode();
    }
}