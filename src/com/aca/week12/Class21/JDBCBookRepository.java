package com.aca.week12.Class21;

import com.aca.week11.Class20.BookRepository;
import com.aca.week11.Homework08.proxybook.Book;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCBookRepository implements BookRepository {

    private final DataSource dataSource;

    public JDBCBookRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public Book getByTitle(final String title)  {
        Connection connection = null;
        Statement statement = null;

        Book book = new Book();
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            final ResultSet resultSet = statement.executeQuery("select * from books where title = '" +  title + "';");

            ResultSetMetaData metaData = resultSet.getMetaData();

            metaData.getColumnCount();
            metaData.getColumnName(1);
            resultSet.next();

            String id = resultSet.getString("id");
            String bookTitle = resultSet.getString("title");
            String bookAuthor = resultSet.getString("author");


            book.setTitle(bookTitle);
            book.setAuthor(bookAuthor);
            System.out.println(connection);

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

        return book;
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
        }
        finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
