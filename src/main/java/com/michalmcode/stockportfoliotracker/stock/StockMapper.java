package com.michalmcode.stockportfoliotracker.stock;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface StockMapper {
    StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);

    Stock createStockDtotoStock(CreateStockDto stockDTO);
    void updateStockFromDto(UpdateStockDto stockDto, @MappingTarget Stock stock);
}
