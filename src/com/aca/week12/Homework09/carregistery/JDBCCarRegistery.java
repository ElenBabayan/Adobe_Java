package com.aca.week12.Homework09.carregistery;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCCarRegistery implements CarRegisteryRepository {

    private final DataSource dataSource;
    private DocumentRepository documentId;


    public JDBCCarRegistery(DataSource dataSource, DocumentRepository documentId) {
        this.dataSource = dataSource;
        this.documentId = documentId;
    }

    @Override
    public void create(Car car) {
        Statement statement = null;
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute("insert into car (markName, modelName) values ('" + car.getMarkName() +
                    "','" + car.getModelName() + "');");
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
    public Car getById(long id) {
        Connection connection = null;
        Statement statement = null;

        Car car = new Car();
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            final ResultSet resultSet = statement.executeQuery("select * from Car where id = '" + id + "';");

            resultSet.next();

            String markName = resultSet.getString("markName");
            String modelName = resultSet.getString("modelName");
            //DocumentRepository documentId = (DocumentRepository) resultSet.getObject("document_id");

            car.setMarkName(markName);
            car.setModelName(modelName);
            //car.setDocumentId(documentId);

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

        return car;
    }

    @Override
    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;

        Car car = new Car();
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            for (int i = 0; i < 120; i++) {
                final ResultSet resultSet = statement.executeQuery("select * from Car where id = '" + i + "';");

                resultSet.next();

                String markName = resultSet.getString("markName");
                String modelName = resultSet.getString("modelName");

                carList.add(new Car(markName, modelName));
            }
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

        return carList;
    }
}
