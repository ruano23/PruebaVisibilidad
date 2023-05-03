package repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repository.impl.ProductRepositoryImpl;
import repository.impl.StockRepositoryImpl;

public class StockRepositoryTest {

    private final StockRepository testStockRepository = new StockRepositoryImpl();

    @Test
    @DisplayName("test getAllStock OK")
    void testGetAll (){
        var stocks = testStockRepository.getAll();
        Assertions.assertNotNull(stocks);
        Assertions.assertFalse(stocks.isEmpty());
    }
}
