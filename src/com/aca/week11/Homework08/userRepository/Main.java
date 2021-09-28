package com.aca.week11.Homework08.userRepository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class Main {

    private static String JDBC_URL;
    private static String USERNAME;
    private static String PASSWORD;

    public static DataSource getHikariDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        return new HikariDataSource(config);
    }

    public static void main(String[] args) {
        JDBC_URL = "jdbc:postgresql://localhost:5434/aca";
        USERNAME = "postgres";
        PASSWORD = "postgres";

        UserRepositoryImpl userRepository = new UserRepositoryImpl(getHikariDataSource());

        userRepository.create();

        User user1 = new User();
        for (int i = 0; i < 100; i++) {
            user1.setName("name" + i);
            user1.setSurname("surname" + i);
            user1.setAge(i);
            userRepository.save(user1);
        }

        //     userRepository.deleteAll();

    }
}
