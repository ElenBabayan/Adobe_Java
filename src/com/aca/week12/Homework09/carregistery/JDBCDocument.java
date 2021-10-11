package com.aca.week12.Homework09.carregistery;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCDocument implements DocumentRepository {
    private final DataSource dataSource;
    private PersonRepository personId;


    public JDBCDocument(DataSource dataSource, PersonRepository personId) {
        this.dataSource = dataSource;
        this.personId = personId;
    }

    @Override
    public void create(Document document) {
        Statement statement = null;
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            System.out.println(connection);
            statement.execute("insert into Document (documentNumber) values ('" + document.getDocumentNumber() + "');");
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
    public Document getById(long id) {
        Connection connection = null;
        Statement statement = null;

        Document document = new Document();
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            final ResultSet resultSet = statement.executeQuery("select * from document where id = '" + id + "';");

            resultSet.next();

            String docNumber = resultSet.getString("documentNumber");

//         PersonRepository personId = (PersonRepository) resultSet.getObject("person_id");

            document.setDocumentNumber(docNumber);

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

        return document;
    }
}
