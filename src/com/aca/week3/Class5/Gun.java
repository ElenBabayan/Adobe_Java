package com.aca.week3.Class5;

import java.util.Objects;

/*
public class
OR
class
 - main class shouldn't be private

 String name, constructor, methods - CLASS MEMBERS
 public / nothing / private / protected - mix of three
         (package private)



 */
public class Gun {

    /*
    String toString() - returns a Strings
    boolean equals(Object other)
    int hashCode()
    any object  --->  mappingFunction- int
                 can be represented by int number

    always ask , equal by reference or by states ???
    A1gun A1gun two objects = > not same object by reference,but equal by states

    hashCode helps to access/read objects very fast
    finalize() - object gets destroyed by this method,,, doesn't guarantee that object will be destroyed
    wait()  - parallel working applications
    notify() -
    notifyAll() -
    sequential code VS multithreading
    Object clone() - creates new object in heap- clones the object
    these methods are so important that any object should have them - in data structures for example

     */
    private final String name; // initialize here
                                // or in construct
    private long date;

    private final Counter counter;
  //  private int counter;

    Gun(String name) { //not necessarily pass argument
        super();
        this.name = name;
        this.counter = null;
    }

    Gun(String name, Counter counter) { //not necessarily pass argument
        super();
        this.name = name;
        this.counter = counter;
    }
    public long getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public long getCreationDate() {
        return date;
    }

    public String stringRepresentation() {
        return "name: " + this.getName() + " creation date: " + this.getDate();
    }

    @Override
    public String toString() {
        return "Gun{" +
                "name='" + getName() + '\'' +
                ", date=" + getDate() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
      //  return super.equals(o);
        if(this == o) {
            return true;
        }
        if( o == null) {
            return false;
        }
        //super class can be compared to child class
        // getClass is not right, becase super & child cannot be compared
        if( !(o.getClass().equals(Gun.class)) ) { // returns the class that o is instance of
            return false;
        }
        Gun gun = (Gun) o;
        return gun.getDate() == this.getDate() && gun.getName().equals(this.getName()); // Strings compared by equals
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date);
    }

    public void fire() {
        System.out.println("Fire!");
        counter.increment();
    }

    /*
    do not give out sensitive information via toString
    if variable is private => use a getter in toString
     */

// ctrl + space  toString
}
