package com.michalmcode.stockportfoliotracker.stock;

import java.util.Date;

public class CreateStockDTO {
    private String name;
    private Date openDate;
    private double volume;
    private double openPrice;

    public CreateStockDTO(String name, Date openDate, double volume, double openPrice) {
        this.name = name;
        this.openDate = openDate;
        this.volume = volume;
        this.openPrice = openPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
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
}
