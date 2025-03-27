package com.michalmcode.stockportfoliotracker.stock;

import org.springframework.stereotype.Service;

@Service
public class StockService {
    private final StockRepository repository;

    StockService(StockRepository repository) {
        this.repository = repository;
    }

    public Stock save(CreateStockDto stockDto) {
        Stock stock = StockMapper.INSTANCE.createStockDtotoStock(stockDto);
        repository.save(stock);
        return stock;
    }

    public Stock update(Stock stock, UpdateStockDto stockDto) {
        StockMapper.INSTANCE.updateStockFromDto(stockDto, stock);
        repository.save(stock);
        return stock;
    }
}
