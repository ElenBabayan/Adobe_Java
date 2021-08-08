package com.aca.week4.Class8.immutable;

import java.util.Date;

public final class User {

    private final String name;
    private final Date birthDate;

    public User(String name, Date birthDate) {
        this.name = name;
        this.birthDate = (Date)birthDate.clone(); // therefore cannot modify object, except reflection
    }

    public String getName() {

        return name;
    }

    public Date getBirthDate() {
        return (Date) birthDate.clone(); // therefore cannot modify object, except reflection
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public static void main(String[] args) {
        final User a = new User("A", new Date());
        System.out.println(a);

        final Date birthDate = a.getBirthDate(); // will not change
        birthDate.setTime(birthDate.getTime() - 5000000);
        System.out.println(a);

        birthDate.setTime(birthDate.getTime() - 500000000);
        System.out.println(a);

        // valueOf checks if null prints null, else calls toString()
    }

    //symbol
    //n
}
