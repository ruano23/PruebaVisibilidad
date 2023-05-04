package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VisibilidadProductoControllerTest {

    private final VisibilidadProductoController productoFinal = new VisibilidadProductoController();

    @Test
    @DisplayName("test controller OK")
    void testController(){

        List<Integer> salida = productoFinal.getProductsAvailables();
        Assertions.assertNotNull(salida);
        Assertions.assertFalse(salida.isEmpty());
        System.out.println("La lista de productos en el controlador es la siguiente: " + salida);
    }
}
