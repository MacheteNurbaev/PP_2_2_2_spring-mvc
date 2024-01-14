package web.carDao;

import web.model.Car;

import java.util.List;

public interface Dao {
    List<Car> listCars();

    List<Car> countCars(Integer count);

}



