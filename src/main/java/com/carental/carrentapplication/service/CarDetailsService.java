package com.carental.carrentapplication.service;

import com.carental.carrentapplication.repository.CarDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class CarDetailsService {

    private final CarDetailsRepository carDetailsRepository;

    public CarDetailsService(CarDetailsRepository carDetailsRepository) {
        this.carDetailsRepository = carDetailsRepository;
    }
}
