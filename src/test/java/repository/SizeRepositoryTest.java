package repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repository.impl.SizeRepositoryImpl;

public class SizeRepositoryTest {

    private final SizeRepository testRepository = new SizeRepositoryImpl();

    @Test
    @DisplayName("test getAllSize OK")
    void testGetAll (){
        var sizes = testRepository.getAll();
        Assertions.assertNotNull(sizes);
        Assertions.assertFalse(sizes.isEmpty());
    }
}
