package com.aca.class24.entity;

import com.aca.class24.User;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "token")
public class Token {

    public Token() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "token_generator")
    @SequenceGenerator(name = "token_generator", sequenceName = "token_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "value")
    private String value;

    //many tokens to one user
    @ManyToOne
    @JoinColumn(name = "USER_ID", foreignKey = @ForeignKey(name = "fk_token_user_id"))
    // @Column(name = "user")
    private User user;

    @Column(name = "created_At")
    private LocalDateTime createdAt;

    public Token(String value, User user, LocalDateTime createdAt) {
        this.value = value;
        this.user = user;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Token token = (Token) o;

        return new EqualsBuilder().append(id, token.id).append(value, token.value).append(user, token.user).append(createdAt, token.createdAt).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(value).append(user).append(createdAt).toHashCode();
    }


    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

