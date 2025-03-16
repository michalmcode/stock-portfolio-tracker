package com.michalmcode.stockportfoliotracker.stock;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StockMapper {
    StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);

    CreateStockDto stockToCreateStockDto(Stock stock);
    Stock createStockDtotoStock(CreateStockDto stockDTO);
}
