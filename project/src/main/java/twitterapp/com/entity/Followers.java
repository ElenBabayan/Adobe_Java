package twitterapp.com.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "FOLLOWER")
@Entity
public class Followers {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator")
    @SequenceGenerator(name = "my_generator", sequenceName = "users_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "created_at")
    private Timestamp created_at;

    @ManyToOne //many followers to one user
    @JoinColumn(name = "user_id")
    private User user_id;

    @ManyToOne //many followings to one user
    @JoinColumn(name = "following_id") //???
    private User following_id;

    public Followers() {
    }

    public Followers(Timestamp created_at, User user_id, User following_id) {
        this.created_at = created_at;
        this.user_id = user_id;
        this.following_id = following_id;
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

    public User getFollowing_id() {
        return following_id;
    }

    public void setFollowing_id(User following_id) {
        this.following_id = following_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Followers follower = (Followers) o;

        return new EqualsBuilder().append(id, follower.id).append(created_at, follower.created_at).append(user_id, follower.user_id).append(following_id, follower.following_id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(created_at).append(user_id).append(following_id).toHashCode();
    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", user_id=" + user_id +
                ", following_id=" + following_id +
                '}';
    }
}
