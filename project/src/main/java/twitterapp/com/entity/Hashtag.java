package twitterapp.com.entity;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import javax.persistence.*;

@Entity
@Table(name = "hashtag")
public class Hashtag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hashtag_generator")
    @SequenceGenerator(name = "hashtag_generator", sequenceName = "hashtag_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "hashtag")
    private String hashtag;

    public Hashtag() {
    }

    public Hashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Hashtag hashtag1 = (Hashtag) o;

        return new EqualsBuilder().append(hashtag, hashtag1.hashtag).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(hashtag).toHashCode();
    }

    @Override
    public String toString() {
        return "Hashtag{" +
                "id=" + id +
                ", hashtag='" + hashtag + '\'' +
                '}';
    }
}

