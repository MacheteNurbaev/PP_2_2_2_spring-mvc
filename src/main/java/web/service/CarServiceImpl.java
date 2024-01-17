package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.carDao.Dao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private Dao dao;

    @Autowired
    public CarServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> listCars() {
        return dao.listCars();
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        return dao.getCarsByCount(count);
    }
}
