package com.aca.week11.Homework08.userRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepositoryImpl implements UserRepository {

    private final DataSource dataSource;

    public UserRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(User user) {

        Connection connection = null;
        Statement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute(("insert into users (name, surname, age) values ('" + user.getName() +
                    "','" + user.getSurname() + "','" + user.getAge()  + "');"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteAll() {
        Statement statement = null;
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute("drop table users");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void create() {
        Statement statement = null;
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute("create table users(id bigserial primary key, name varchar(255), surname varchar(255), age integer not null);");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
