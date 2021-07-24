package com.aca.week2.Class4;

public class Person {

        private long age;
        //local variable
        private final long birthMilli; // FINAL - CANNOT SET A NEW VALUE, but can be setter function

        public Person() {
            birthMilli = 0;
        }



//        public Person(long birthMilli, long age) {
//            this.birthMilli = birthMilli;
//            this.age = age;
//        }
//
//        public void setAge(long age) {
//            this.age = age;
//        }

//        public void setBirthMilli(long birthMilli) {
//            this.birthMilli = birthMilli; //Cannot assign a value to final variable 'birthMilli'
//        }

        //error same signature
//        public Person(long birthMillis) {
//            this.birthMilli = birthMillis;
//        }
//
//        public Person(long age) {
//            this.age = age;
//        }

        //until all lines of constructor are not read, person object is not created
        //if delete this - no default noarg constructor is created
//        public Person() {
//            System.out.println("the person will be created");
//        }

        // ctrl shift v - paste history

//        public Person(long birthMillis)  {
//            // if wrong => no object can be created
//            if(birthMillis < 0) {
//                throw new  RuntimeException();
//            }
//            //this.age = (int) (Math.toIntExact((birthMillis / (24 * 360000 * 365));
//             // if delete this - error(
//        }

//        public Person(String name) {
//            System.out.println(name);
//        }
//
//        // constructor is equivalent to this
//        public Person createPerson() {
//
//        }
//        public void setBirthMillis(long birthMillis) {
//            this.birthMillis = birthMillis;
//        }

    }
