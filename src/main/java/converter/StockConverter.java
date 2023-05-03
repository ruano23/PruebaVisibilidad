package converter;

import dto.StockDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import domain.Stock;

@Component
@Mapper(componentModel = "spring")
public interface StockConverter {

    /**
     * Convert from {@link StockDTO} to {@link Stock} * * @param StockDTO {@link StockDTO} * @return {@link Stock}
     */
    Stock toStock(StockDTO stockDTO);

    /**
     * Convert from {@link Stock} to {@link StockDTO} * * @param Stock {@link Stock} * @return {@link StockDTO}
     */
    StockDTO toStockDTO(Stock stock);

}
