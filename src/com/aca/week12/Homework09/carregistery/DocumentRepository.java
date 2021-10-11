package com.aca.week12.Homework09.carregistery;

public interface DocumentRepository {

    void create(Document car);

    Document getById(long id);
}
