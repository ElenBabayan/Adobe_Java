package com.aca.week11.Class19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws SQLException {
        /*
        DriverManager.getC
        implementacia handisacox class piti veradardzni
        vory goyutyun chuni => exception
        ayd classeri hamaxumby kochvum e driver

         */
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5434/aca",
                "postgres",
                "postgres"
        );

        final Statement statement = connection.createStatement();
        statement.execute("insert into users (name, age) values ('user1', 45)");
        statement.execute("insert into users (name, age) values ('user2', 75)");
        statement.execute("insert into users (name, age) values ('user3', 35)");
        statement.execute("insert into users (name, age) values ('user4', 47)");
        statement.execute("insert into users (name, age) values ('user5', 23)");
        statement.execute("insert into users (name, age) values ('user6', 12)");

        for (int i = 0; i < 100; i++) {
            statement.execute("insert into users (name, age) " +
                    "values ('user" + i + "'," + new Random().nextInt(50) + ")");
        }

        statement.close();
        connection.close();
    }

}
