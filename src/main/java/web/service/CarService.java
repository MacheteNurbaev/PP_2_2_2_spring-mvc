package web.service;

import org.springframework.stereotype.Component;
import web.carDao.CarDao;
import web.carDao.Dao;
import web.model.Car;

import java.util.List;

@Component
public class CarService implements Service {
    private Dao dao = new CarDao();

    @Override
    public List<Car> listCars() {
        return dao.listCars();
    }

    @Override
    public List<Car> countCars(Integer count) {
        return dao.countCars(count);
    }
}
