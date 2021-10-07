package com.aca;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Token.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();

        User user = new User(
                "fist name",
                "second name",
                "username",
                "password",
                LocalDateTime.now());

   //     session.save(user);

        Token token = new Token(
                UUID.randomUUID().toString(),
                user,
                LocalDateTime.now()
        );
       // session.save(token);

//        transaction.rollback(); // cancell
//        transaction.commit();
//

        UserRepository userRepository = new HibernateUserRepository(sessionFactory);
        TokenRepository tokenRepository  = new HibernateTokenRepository(sessionFactory);
        user = new User(             "fist name",
                "second name",
                "username",
                "password",
                LocalDateTime.now());
        User savedUser = userRepository.create(user);
        token = new Token(UUID.randomUUID().toString(), user, LocalDateTime.now());
        Token savedToken = tokenRepository.create(token);

        User userById2 = userRepository.getById(user.getId());
//        System.out.println(userById2.getTokens());
//        System.out.println();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        User merge = (User) session.merge(userById2);
        List<Token> tokens = merge.getTokens();
        System.out.println(tokens);
        System.out.println(userById2.getTokens());

        transaction.commit();
        session.close();

        // in DB - sessionFactory - configs
    }
}
