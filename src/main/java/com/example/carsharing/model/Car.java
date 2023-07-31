package com.example.carsharing.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String model;
    private String brand;
    @Enumerated(EnumType.STRING)
    private Type type;
    private int inventor;
    private BigDecimal dailyFee;

    public enum Type {
        SEDAN,
        SUV,
        HATCHBACK,
        UNIVERSAL
    }
}