package com.carental.carrentapplication.service;

import com.carental.carrentapplication.entity.Car;
import com.carental.carrentapplication.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void save(Car car) {
        carRepository.save(car);
    }

    public Car findById(int carId) {
        return carRepository.findById(carId).get();
    }


}
