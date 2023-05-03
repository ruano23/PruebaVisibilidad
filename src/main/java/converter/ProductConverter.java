package converter;

import domain.Product;
import dto.ProductDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ProductConverter {

    /**
     * Convert from {@link ProductDTO} to {@link Product} * * @param ProductDTO {@link ProductDTO} * @return {@link Product}
     */
    Product toProduct(ProductDTO productDTO);

    /**
     * Convert from {@link Product} to {@link ProductDTO} * * @param Product {@link Product} * @return {@link ProductDTO}
     */
    ProductDTO toProductDTO(Product product);
}
