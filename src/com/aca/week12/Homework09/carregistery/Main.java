package com.aca.week12.Homework09.carregistery;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

public class Main {

    private static String JDBC_URL;
    private static String USERNAME;
    private static String PASSWORD;

    public static void main(String[] args) {

        JDBC_URL = "jdbc:postgresql://localhost:5432/carregistery";
        USERNAME = "postgres";
        PASSWORD = "elen"; // DataSource interface
        Scanner scanner = new Scanner(System.in);
        JDBCPerson jdbcPerson = new JDBCPerson(getHikariDataSource());
        JDBCDocument jdbcDocument = new JDBCDocument(getHikariDataSource(), jdbcPerson);
        JDBCCarRegistery carRegistery = new JDBCCarRegistery(getHikariDataSource(), jdbcDocument);

        Car car = new Car();
        Document document = new Document();
        Person person = new Person();

        for (int i = 0; i < 120; i++) {
            person.setName("name" + i);
            person.setSurname("surname" + i);
            person.setPassportNumber(i);
            jdbcPerson.create(person);

            document.setDocumentNumber("docNumber" + i);
            jdbcDocument.create(document);

            car.setModelName("M" + i);
            car.setMarkName("BMW" + i);
            carRegistery.create(car);
        }

        System.out.println(carRegistery.getById(54));
        carRegistery.getById(60);
        carRegistery.getById(92);

        jdbcDocument.getById(54);
        System.out.println(jdbcDocument.getById(60));
        jdbcDocument.getById(92);

        jdbcPerson.getById(54);
        jdbcPerson.getById(60);
        System.out.println(jdbcPerson.getById(92));

    }

    public static DataSource getHikariDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        return new HikariDataSource(config);
    }
}
