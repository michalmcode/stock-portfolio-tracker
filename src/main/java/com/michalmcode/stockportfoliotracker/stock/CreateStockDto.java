package com.michalmcode.stockportfoliotracker.stock;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public class CreateStockDto {

    @NotBlank(message = "The name is required.")
    @Length(max = 255, message = "The name exceeds the maximum length of 3 characters.")
    private String name;

    @NotNull(message = "The date is required.")
    @PastOrPresent(message = "The date cannot be in the future.")
    private LocalDate openDate;

    @NotNull(message = "The volume is required.")
    @Min(value = 0, message="The volume must be greater than 0.")
    private Double volume;

    @NotNull(message = "The open price is required.")
    @Min(value = 0, message="The open price must be greater than 0.")
    private Double openPrice;

    public CreateStockDto(String name, LocalDate openDate, Double volume, Double openPrice) {
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

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
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
}
