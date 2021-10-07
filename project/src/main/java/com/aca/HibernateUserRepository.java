package com.aca;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateUserRepository implements UserRepository{

    private final SessionFactory sessionFactory;

    public HibernateUserRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public User create(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);

        transaction.commit();;
        session.close();

        return user;
    }

    @Override
    public User getById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        User user = session.find(User.class, id);
        transaction.commit();
        session.close();
        return user;
    }
}
