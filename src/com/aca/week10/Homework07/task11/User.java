package com.aca.week10.Homework07.task11;

import java.util.Objects;

public class User implements Comparable {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        User u = (User) o;
        if(this.age == u.getAge()) {
            return 0;
        }
        else if(this.age > u.getAge()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        User user = (User) o;
        return age == user.age && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
