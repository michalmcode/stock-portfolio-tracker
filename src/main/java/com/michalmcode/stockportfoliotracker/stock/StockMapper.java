package com.michalmcode.stockportfoliotracker.stock;

import org.springframework.stereotype.Component;

@Component
public class StockMapper {
    public Stock createStockDtoToStock(CreateStockDTO createStockDTO) {
        return new Stock(
                createStockDTO.getName(),
                createStockDTO.getOpenDate(),
                createStockDTO.getVolume(),
                createStockDTO.getOpenPrice()
        );
    }
}
