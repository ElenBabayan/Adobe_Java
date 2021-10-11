package com.aca.week12.Homework09.carregistery;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCPerson implements PersonRepository {

    private final DataSource dataSource;

    public JDBCPerson(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void create(Person person) {
        Statement statement = null;
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute("insert into Person (name, surname, passportNumber) values ('" + person.getName() +
                    "','" + person.getSurname() + "','" + person.getPassportNumber() + "');");
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

    @Override
    public Person getById(long id) {
        Connection connection = null;
        Statement statement = null;

        Person person = new Person();
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            final ResultSet resultSet = statement.executeQuery("select * from Person where id = '" + id + "';");

            // ResultSetMetaData metaData = resultSet.getMetaData();
            resultSet.next();

            String personName = resultSet.getString("name");
            String personSurname = resultSet.getString("surname");
            Integer personPassportNumber = resultSet.getInt("passportNumber");

            person.setName(personName);
            person.setSurname(personSurname);
            person.setPassportNumber(personPassportNumber);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
