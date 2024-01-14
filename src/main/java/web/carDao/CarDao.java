package web.carDao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao implements Dao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Nissan", 1000, "black"));
        cars.add(new Car(2, "Toyota", 2000, "white"));
        cars.add(new Car(3, "Fiat", 3000, "black"));
        cars.add(new Car(4, "Dodge", 4000, "yellow"));
        cars.add(new Car(5, "Pontiac", 5000, "green"));
    }

    @Override
    public List<Car> listCars() {
        return cars;

    }

    @Override
    public List<Car> countCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
