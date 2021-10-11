package twitterapp.com.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;

@Entity
@Table(name = "tweet_hashtag_link")
public class Tweet_Hashtag_Link {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator")
    @SequenceGenerator(name = "my_generator", sequenceName = "users_id_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne
    @Column(name = "tweet_id")
    private Tweet tweet_id;

    @ManyToOne
    @Column(name = "hashtag_id")
    private Tweet hashtag_id;

    public Tweet_Hashtag_Link() {
    }

    public Tweet_Hashtag_Link(Tweet tweet_id, Tweet hashtag_id) {
        this.tweet_id = tweet_id;
        this.hashtag_id = hashtag_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tweet getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(Tweet tweet_id) {
        this.tweet_id = tweet_id;
    }

    public Tweet getHashtag_id() {
        return hashtag_id;
    }

    public void setHashtag_id(Tweet hashtag_id) {
        this.hashtag_id = hashtag_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Tweet_Hashtag_Link that = (Tweet_Hashtag_Link) o;

        return new EqualsBuilder().append(id, that.id).append(tweet_id, that.tweet_id).append(hashtag_id, that.hashtag_id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(tweet_id).append(hashtag_id).toHashCode();
    }

    @Override
    public String toString() {
        return "Tweet_Hashtag_Link{" +
                "id=" + id +
                ", tweet_id=" + tweet_id +
                ", hashtag_id=" + hashtag_id +
                '}';
    }
}
