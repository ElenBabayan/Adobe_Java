package com.aca.class23;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {

        User user = new User("username1", "password");

//        String s = FileUtils.readFileToString(new File("/home/gohar/Downloads/sql_aca.txt"),
//                StandardCharsets.UTF_8);
//        System.out.println(s);

//        generateSql("dfsdf");

        generateSql(user);

    }

    //insert into users(USER_NAME, PASSWORD) values ('username1', 'password')
    public static String generateSql(Object object) throws IllegalAccessException {
        final Class<? extends Object> aClass = object.getClass();
        Table declaredAnnotation = aClass.getDeclaredAnnotation(Table.class);
        if (declaredAnnotation == null) {
            throw new IllegalArgumentException("The provided object " + object.getClass().getCanonicalName() + " is not an entity");
        }
        String name = declaredAnnotation.name();
        Field[] declaredFields = aClass.getDeclaredFields();
        List<Field> fields = new LinkedList<>();
        for (Field field : declaredFields) {
            if (field.getDeclaredAnnotation(Column.class) != null) {
                fields.add(field);
            }
        }
        if (fields.size() == 0) {
            throw new IllegalStateException("Provided entity object: " + aClass.getCanonicalName() + " has no columns");
        }
        String columns = "";
        String values = "";

        for (Field field: fields) {
            columns += field.getDeclaredAnnotation(Column.class).name() + ",";
            field.setAccessible(true);
            values += "'" + field.get(object) + "',";
        }


        return "insert into " + name + "(" + columns.substring(0, columns.length() - 1) + ") values(" + values.substring(0,values.length() - 1) + ")";
    }
}