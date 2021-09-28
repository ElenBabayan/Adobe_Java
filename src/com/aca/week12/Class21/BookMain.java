package com.aca.week12.Class21;

import com.aca.week11.Class20.BookRepository;
import com.aca.week11.Class20.JDBCBookRepository;
import com.aca.week11.Homework08.proxybook.Book;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BookMain {

    private static String JDBC_URL;
    private static String USERNAME;
    private static String PASSWORD;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        JDBC_URL = "jdbc:postgresql://localhost:5433/aca";
        USERNAME = "postgres";
        PASSWORD = "postgres"; // DataSource interface
//        HikariDataSource dataSource = new HikariDataSource();
//        // interfacey chuner methodnery set => PGSov
//        dataSource.setJdbcUrl( "jdbc:postgresql://localhost:5433/aca");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("postgres");
//
//        BookRepository bookRepository = new JDBCBookRepository(dataSource);
//        final Book book = new Book();
//        book.setAuthor("Three Comrades");
//        book.setTitle("E. M. Remarque");
//        bookRepository.create(book);

//        final Book book1 = new Book();
//        for (int i = 0; i < 1000; i++) {
//            book1.setAuthor("Author" + i);
//            book1.setTitle("Title" + i);
//            bookRepository.create(book1);
//        }

        System.out.println("0:Hikari");
        System.out.println("1:PG");
        Scanner scanner = new Scanner(System.in);
        final int selectionId = scanner.nextInt();

        BookRepository bookRepository1 = new JDBCBookRepository(resolveDataSource(selectionId));

        final long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<?>> futureList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Future<?> future = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    bookRepository1.create(new Book("Java", "Author" + finalI));
                }
            });
            //  future.get(); // will stop the Main thread, and wait until the runnable ends its execution
            futureList.add(future);
        }

        executorService.shutdown();

        for (final Future<?> future : futureList) {
            future.get();
        }

        System.out.println(System.currentTimeMillis() - start);
        // PG - 38 seconds
        // Hikari - 14 seconds
        // hikari - faster, pooling, connection management, synchronised, thread safe


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

    public static DataSource resolveDataSource(int selectionId) {
        if (selectionId == 0) {
            return getHikariDataSource();
        }
        if (selectionId == 1) {
            return getPgDataSource();
        }
        throw new IllegalArgumentException(
                String.format("Could not find datasource for provided number %s", selectionId)
        );
    }
}

/*
     Listi het main thread na ashxatum, synchronisationi kariq chka
     Listi vra ete 1 threadic avel thread a ashxatum, read/write => synchronised

 */