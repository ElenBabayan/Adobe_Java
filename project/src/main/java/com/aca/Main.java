package com.aca;

import com.aca.entity.Token;
import com.aca.entity.User;
import com.aca.mapper.UserDetailsModel;
import com.aca.mapper.UserMapper;
import com.aca.mapper.UserMapperImpl;
import com.aca.repository.HibernateUserRepository;
import com.aca.service.user.UserCreateParams;
import com.aca.service.user.UserService;
import com.aca.service.user.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        /*
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
        User savedUser = userRepository.save(user);
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

         */

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Token.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        UserService userService = new UserServiceImpl(
                new HibernateUserRepository(
                        sessionFactory
                )
        );

        User user = userService.create(
                new UserCreateParams(
                        "user1",
                        "password1",
                        "Name",
                        "Surname"
                )
        );

        UserMapper userMapper = new UserMapperImpl();
        UserDetailsModel model = userMapper.map(user);
        System.out.println(model);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(model);

        System.out.println(jsonString);

    }
}