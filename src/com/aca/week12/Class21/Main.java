package com.aca.week12.Class21;

import com.aca.week11.Homework08.proxybook.Book;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.util.concurrent.Future;

public class Main {

    private static String JDBC_URL;
    private static String USERNAME;
    private static String PASSWORD;


    public static void main(String[] args) {
        JDBC_URL = "jdbc:postgresql://localhost:5434/aca";
        USERNAME = "postgres";
        PASSWORD = "postgres"; // DataSource interface


        JDBCBookRepository bookRepository1 = new JDBCBookRepository(getHikariDataSource(),
                new JDBCPersonRepository(getHikariDataSource()));

//        for (int i = 0; i < 100; i++) {
//            bookRepository1.create(new Book("Java" + i, "Author" + i));
//        }
        Book book = bookRepository1.getByTitle("Java1");

        System.out.println(book);
    }

    public static DataSource getPgDataSource() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setURL(JDBC_URL);
        dataSource.setUser(USERNAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }

    public static DataSource getHikariDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        return new HikariDataSource(config);
    }
    
    // Title:java
}
