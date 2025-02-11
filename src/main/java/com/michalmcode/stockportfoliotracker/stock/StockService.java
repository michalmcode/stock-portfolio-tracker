package com.michalmcode.stockportfoliotracker.stock;

import org.springframework.stereotype.Service;

@Service
public class StockService {
    private final StockMapper mapper;
    private final StockRepository repository;

    StockService(StockRepository repository, StockMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Stock save(CreateStockDTO stockDto) {
        Stock stock = mapper.createStockDtoToStock(stockDto);
        repository.save(stock);
        return stock;
    }
}
