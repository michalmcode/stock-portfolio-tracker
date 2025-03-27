package com.michalmcode.stockportfoliotracker.stock;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {
    private final StockRepository repository;
    private final StockService service;

    StockController(StockRepository repository, StockService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public List<Stock> getStocks() {
        return repository.findAll();
    }

    @PostMapping
    public Stock createStock(@Valid @RequestBody CreateStockDto stockDTO) {
        return service.save(stockDTO);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Stock> updateStock(@PathVariable long id, @Valid @RequestBody UpdateStockDto stockDto) {
        Stock stock = repository.findById(id).orElse(null);
        if (stock != null) {
            Stock updatedStock = service.update(stock, stockDto);
            return ResponseEntity.ok(updatedStock);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
