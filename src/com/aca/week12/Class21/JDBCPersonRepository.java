package com.aca.week12.Class21;

import com.aca.week11.Homework08.proxybook.Book;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCPersonRepository implements PersonRepository{

    private final DataSource dataSource;

    public JDBCPersonRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Person getById(long id) {

        Connection connection = null;
        Statement statement = null;

        Person person = new Person();
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            final ResultSet resultSet = statement.executeQuery("select * from person where id = '" +  id + "';");

//            ResultSetMetaData metaData = resultSet.getMetaData();
//
//            metaData.getColumnCount();
//            metaData.getColumnName(1);
            resultSet.next();

            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            person.setName(name);
            person.setAge(age);
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

        return person;

    }
}
