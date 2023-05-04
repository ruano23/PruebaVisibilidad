package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.VisibilidadProductoService;
import service.impl.VisibilidadProductoServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/products")
public class VisibilidadProductoController {

    @Autowired
    private VisibilidadProductoService visibilidadProductoService = new VisibilidadProductoServiceImpl();

    @GetMapping(value = "availables")
    public List<Integer> getProductsAvailables() {
        return visibilidadProductoService.executeAlgorithm();
    }


}
