package com.michalmcode.stockportfoliotracker.stock;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

public class UpdateStockDto {
    // Using wrapper classes because of partial update
    @Length(max = 255, message = "The name exceeds the maximum length of 3 characters.")
    private String name;

    @PastOrPresent(message = "The date cannot be in the future.")
    private Date openDate;

    @PastOrPresent(message = "The date cannot be in the future.")
    private Date closeDate;

    @Min(value = 0, message="The volume must be greater than 0.")
    private Double volume;

    @Min(value = 0, message="The open price must be greater than 0.")
    private Double openPrice;

    @Min(value = 0, message="The open price must be greater than 0.")
    private Double closePrice;

    public UpdateStockDto(String name, Date openDate, Date closeDate, Double volume, Double openPrice, Double closePrice) {
        this.name = name;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.volume = volume;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
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

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }
}
