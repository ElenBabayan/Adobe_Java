package com.aca.week11.Class20;

import com.aca.week11.Homework08.proxybook.Book;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBookRepository implements BookRepository {

    private final DataSource dataSource;

    public JDBCBookRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(final Book book) {

//        Connection connection = null;
//        Statement statement = null;
//        try {
//             connection = DriverManager.getConnection(
//                    "jdbc:postgresql://localhost:5433/aca",
//                    "postgres",
//                    "postgres"
//            );
//             statement = connection.createStatement();
        // replace DriverManager with dataSource
        Statement statement = null;
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            System.out.println(connection);
            statement.execute("insert into books (title, author) values ('" + book.getTitle() +
                    "','" + book.getAuthor() + "');");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
