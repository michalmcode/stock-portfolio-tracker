package com.michalmcode.stockportfoliotracker.stock;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate openDate;

    private LocalDate closeDate;

    @Column(nullable = false)
    private double volume;

    @Column(nullable = false)
    private double openPrice;

    private Double closePrice;

    private Double openValue;

    private Double closeValue;

    private Integer duration;

    private String durationUnit;

    @Column(name = "return")
    private Double returnValue;

    private Stock() {

    }

    public Stock(String name, LocalDate openDate, double volume, double openPrice) {
        this.name = name;
        this.openDate = openDate;
        this.volume = volume;
        this.openPrice = openPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    public LocalDate getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Double getOpenValue() {
        return openValue;
    }

    public void setOpenValue(Double openValue) {
        this.openValue = openValue;
    }

    public Double getCloseValue() {
        return closeValue;
    }

    public void setCloseValue(Double closeValue) {
        this.closeValue = closeValue;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
    }

    public Double getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Double returnValue) {
        this.returnValue = returnValue;
    }
}
