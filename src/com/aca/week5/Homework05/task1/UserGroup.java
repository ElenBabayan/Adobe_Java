package com.aca.week5.Homework05.task1;

import java.util.Arrays;

public class UserGroup {
    private User[] users = new User[10];
    private int size = 0;

    public UserGroup() {

    }

/*    public UserGroup(User[] users, int size) {
        for(int i = 0; i < users.length; i++) {
            this.users[i] = new User(users[i]);
        }
        this.size = size;
    }*/

    public void addUser(User user) {
        if(size < 10) {
            this.users[size] = user;
            size++;
        }
        else {
            throw new UsersIsFullException("Users array is limited to 10 elements. Cannot add more elements.");
        }
    }

    public UserGroup clone() {
        UserGroup usersCloned = new UserGroup();
        for(int i = 0; i < size; ++i) {
            User userCloned = new User(this.users[i]);
            usersCloned.addUser(userCloned);
        }
        usersCloned.size = this.size;
        return usersCloned;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "users=" + Arrays.toString(users) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        UserGroup o = new UserGroup();
        o.addUser(new User("Elen", "Babayan", "elenb", "elen@mail.ru"));
        o.addUser(new User("Elen1", "Babayan1", "elenb1", "elen1@mail.ru"));
        o.addUser(new User("Elen2", "Babayan2", "elenb2", "elen2@mail.ru"));
        o.addUser(new User("Elen3", "Babayan3", "elenb3", "elen3@mail.ru"));

        UserGroup cloned = o.clone();
        System.out.println(cloned);
    }
}

