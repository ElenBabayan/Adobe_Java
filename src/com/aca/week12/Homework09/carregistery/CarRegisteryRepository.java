package com.aca.week12.Homework09.carregistery;

import java.util.List;

public interface CarRegisteryRepository {

    void create(Car car);

    Car getById(long id);

    List<Car> getCars();

}
