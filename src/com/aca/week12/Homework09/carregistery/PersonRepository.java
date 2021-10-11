package com.aca.week12.Homework09.carregistery;

public interface PersonRepository {

    void create(Person person);

    Person getById(long id);

}
