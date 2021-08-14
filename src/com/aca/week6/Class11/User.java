package com.aca.week6.Class11;

public class User<T> implements Comparable<T> {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(T o)  {

//        if(!(o instanceof User)) {
//            throw new UserCastException("User's compareTo method should be compared with an instance of User");
//        }

        User user = (User) o;
        return getName().compareTo(user.getName());
    }

    @Override
    public String
    toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
