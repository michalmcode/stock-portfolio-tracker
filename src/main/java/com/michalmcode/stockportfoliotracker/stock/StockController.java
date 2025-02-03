package com.michalmcode.stockportfoliotracker.stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    private final StockRepository stockRepository;

    StockController(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @GetMapping("/stocks")
    public List<Stock> allStocks() {
        return stockRepository.findAll();
    }
}
