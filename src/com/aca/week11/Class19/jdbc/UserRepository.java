package com.aca.week11.Class19.jdbc;

import java.sql.SQLException;

public interface UserRepository {

    void create(String name, int age) throws SQLException;

    void deleteAll();
}
