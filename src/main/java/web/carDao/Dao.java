package web.carDao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;


public interface Dao {
    List<Car> listCars();

    List<Car> getCarsByCount(Integer count);

}



