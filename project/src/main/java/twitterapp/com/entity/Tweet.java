package twitterapp.com.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "TWEET")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator")
    @SequenceGenerator(name = "my_generator", sequenceName = "users_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "user_id")
    @ManyToOne // many tweets to one user
    private User user_id;

    public Tweet() {
    }

    public Tweet(String content, Timestamp created_at, User user_id) {
        this.content = content;
        this.created_at = created_at;
        this.user_id = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Tweet tweet = (Tweet) o;

        return new EqualsBuilder().append(id, tweet.id).append(content, tweet.content).append(created_at, tweet.created_at).append(user_id, tweet.user_id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(content).append(created_at).append(user_id).toHashCode();
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created_at=" + created_at +
                ", user_id=" + user_id +
                '}';
    }
}