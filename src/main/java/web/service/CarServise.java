package web.service;

import web.model.Car;

import java.util.List;

public interface CarServise {

    List<Car> getCarList(int count);
}
