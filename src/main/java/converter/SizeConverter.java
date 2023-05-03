package converter;

import dto.SizeDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import domain.Size;

    @Component
    @Mapper(componentModel = "spring")
    public interface SizeConverter {

        /**
         * Convert from {@link SizeDTO} to {@link Size} * * @param SizeDTO {@link SizeDTO} * @return {@link Size}
         */
        Size toStock(SizeDTO sizeDTO);

        /**
         * Convert from {@link Size} to {@link SizeDTO} * * @param Size {@link Size} * @return {@link SizeDTO}
         */
        SizeDTO toStockDTO(Size size);
}
