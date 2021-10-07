package com.aca.week12.Homework09;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.print.Doc;
import javax.sql.DataSource;
import java.util.Scanner;

public class CarMain {
    /*
    Create a Database Car Registery
    which need to have
    1.Person Table with columns Name, Surname,Passport number
    2.Document table with columns, Person_id(which refers To one person in person table)
    Document number (Generate Random Numeric String )
    3.Car Table
    With columns Mark Name ,Model name,Document id(which refers to one document in Document table )
    Create Repositories for all previously marked Entities with methods create and getById
    Create 100 examples of each Entity and then print Entities with Id 54 ,60 ,92
     */
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
        //    car.setDocumentId(jdbcDocument);
      //      carRegistery.create(car);


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
