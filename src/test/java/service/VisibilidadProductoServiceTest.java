package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repository.ProductRepository;
import repository.SizeRepository;
import repository.StockRepository;
import repository.impl.ProductRepositoryImpl;
import repository.impl.SizeRepositoryImpl;
import repository.impl.StockRepositoryImpl;
import service.impl.VisibilidadProductoServiceImpl;

public class VisibilidadProductoServiceTest {

    private final VisibilidadProductoService execute = new VisibilidadProductoServiceImpl();
    @Test
    @DisplayName("test executeAlgorithm OK")
    void testExecuteAlgorithm (){

        var salida = execute.executeAlgorithm();

        System.out.println("Los productos visibles son los siguientes: "+salida);
        Assertions.assertNotNull(salida);
        Assertions.assertFalse(salida.isEmpty());


    }
}
