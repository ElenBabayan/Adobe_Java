package com.aca.repository;

import com.aca.entity.Token;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTokenRepository implements TokenRepository {
    private final SessionFactory sessionFactory;

    public HibernateTokenRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Token create(Token token) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(token);
        transaction.commit();;
        session.close();
        return token;
    }

    @Override
    public Token getById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        Token token = session.find(Token.class, id);
        transaction.commit();
        session.close();
        return token;
    }
}
