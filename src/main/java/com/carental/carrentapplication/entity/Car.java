package com.carental.carrentapplication.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "model")
    private String model;

    @OneToMany(mappedBy = "car", fetch = FetchType.EAGER)
    private Set<Reservation> reservations = new HashSet<>();

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private CarDetails carDetails;

    public Car(int carId, String manufacturer, String model) {
        this.carId = carId;
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
