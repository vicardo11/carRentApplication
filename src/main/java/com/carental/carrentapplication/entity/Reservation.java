package com.carental.carrentapplication.entity;

import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int reservationId;

    @Column(name = "starting_date_of_reservation")
    private LocalDateTime startingDateOfReservation;

    @Column(name = "ending_date_of_reservation")
    private LocalDateTime endingDateOfReservation;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
