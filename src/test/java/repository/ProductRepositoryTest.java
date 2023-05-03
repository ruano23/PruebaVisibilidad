package repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repository.impl.ProductRepositoryImpl;

public class ProductRepositoryTest {

    private final ProductRepository testRepository = new ProductRepositoryImpl();

    @Test
    @DisplayName("test getAllProduct OK")
    void testGetAll (){
        var products = testRepository.getAll();
        Assertions.assertNotNull(products);
        Assertions.assertFalse(products.isEmpty());
    }
}
