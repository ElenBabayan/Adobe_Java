package com.aca.week11.Class19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepositoryImpl implements UserRepository {

    private String url;
    private String username;
    private String password;

    public UserRepositoryImpl(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }


    @Override
    public void create(String name, int age) throws SQLException {

        Connection connection = DriverManager.getConnection(url, name, password);
        Statement statement = connection.createStatement();

        statement.execute("******");
        statement.close();
        connection.close();

    }

    @Override
    public void deleteAll() {

    }
}
