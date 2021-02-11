package com.carental.carrentapplication.entity;

import com.carental.carrentapplication.entity.enums.AxleDrive;
import com.carental.carrentapplication.entity.enums.GearboxType;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "car_details")
@Data
@NoArgsConstructor
public class CarDetails {

    @Id
    @ToString.Exclude
    @Column(name = "car_id")
    private int carId;

    @Column(name = "engine_capacity")
    private double engineCapacity;

    @Column(name = "production_year")
    private int productionYear;

    @Column(name = "horse_power")
    private int horsePower;

    @Column(name = "gearbox_type")
    @Enumerated(value = EnumType.STRING)
    private GearboxType gearboxType;

    @Column(name = "number_of_door")
    private int numberOfDoor;

    @Column(name = "axle_drive")
    @Enumerated(value = EnumType.STRING)
    private AxleDrive axleDrive;

    @Column(name = "avg_fuel_usage")
    private double avgFuelUsage;

    @Column(name = "trunk_capacity")
    private double trunkCapacity;

    @OneToOne
    @ToString.Exclude
    @JoinColumn(name = "car_id")
    private Car car;

    public CarDetails(int carId, double engineCapacity, int productionYear, int horsePower, GearboxType gearboxType,
                      int numberOfDoor, AxleDrive axleDrive, double avgFuelUsage, double trunkCapacity) {
        this.carId = carId;
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
        this.horsePower = horsePower;
        this.gearboxType = gearboxType;
        this.numberOfDoor = numberOfDoor;
        this.axleDrive = axleDrive;
        this.avgFuelUsage = avgFuelUsage;
        this.trunkCapacity = trunkCapacity;
    }
}
