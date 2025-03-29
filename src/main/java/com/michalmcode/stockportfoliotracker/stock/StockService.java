package com.michalmcode.stockportfoliotracker.stock;

import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

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
        stock.setOpenValue(stock.getVolume() * stock.getOpenPrice());
        stock.setCloseValue(stock.getVolume() * stock.getClosePrice());
        stock.setReturnValue(stock.getCloseValue() - stock.getOpenValue());

        stock.setDuration((int) ChronoUnit.DAYS.between(stock.getOpenDate(), stock.getCloseDate()));
        stock.setDurationUnit("days");

        repository.save(stock);
        return stock;
    }
}
