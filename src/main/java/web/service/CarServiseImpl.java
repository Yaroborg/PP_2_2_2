package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiseImpl implements CarServise {
    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Lada", 100, "red"));
        cars.add(new Car("BMW", 200, "blue"));
        cars.add(new Car("Toyota", 300, "green"));
        cars.add(new Car("Nissan", 400, "black"));
        cars.add(new Car("Audi", 500, "white"));
    }

    @Override
    public List<Car> getCarList(int count) {
        return cars.stream().limit(Math.max(count, 0)).toList();
    }
}
