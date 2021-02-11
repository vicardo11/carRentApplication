package com.carental.carrentapplication.repository;

import com.carental.carrentapplication.entity.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDetailsRepository extends JpaRepository<CarDetails, Integer> {
}
