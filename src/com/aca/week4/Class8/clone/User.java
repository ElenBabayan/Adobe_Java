package com.aca.week4.Class8.clone;

public class User implements Cloneable {

    private String name;
    private int age;
    private User friend;


    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                getName().equals(user.getName());
    }

    // not deep copy
    @Override
    protected User clone() throws CloneNotSupportedException {

        final User cloned = (User) super.clone();

        if(cloned.getFriend() != null) {
            cloned.setFriend(cloned.getFriend().clone());
        }// calling clone inside clone

        return cloned;
    }
    // minch der Cloneable interfacey implement chenq arel, clone not supported exception

    public static void main(String[] args) throws CloneNotSupportedException {
        final User user2 = new User();
        user2.setAge(10);
        user2.setName("A");

        final User user1 = new User();
        user1.setAge(10);
        user1.setName("A");
        user1.setFriend(user2);
//        System.out.println(user1.equals(user2));

        // heap um not memory sarqvec, nor object, bolor fieldery copy arvecin
        // copy of user, and they will be equal by EQUALS method
        final User userFirst = user1.clone();
        System.out.println(user1.equals(userFirst));

        // references are not equal
        // System.out.println(userFirst == user1);

        // clone uni mec terutyun, reference type fielderi hamar nor object chi stexcum
        // nuyn friend u namein a point anum

    }



    /*
                        FINALS
    1. if class is final => cannot extend from that class

    2. if field is final => should initialize either in constructor or in place

    3. if method is final => subclass cannot override method

    4. if method argument is final => cannot assign another value inside function

    also private methods cannot be overriden => can say they are final, write only private


     */


    /*
    for immutable class
    1. final class
    2. final fields
    3. NO SETTERS
     */
}
