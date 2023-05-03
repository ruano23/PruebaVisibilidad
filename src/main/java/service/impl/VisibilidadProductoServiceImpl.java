package service.impl;

import domain.Product;
import domain.Size;
import domain.Stock;
import org.springframework.stereotype.Service;
import repository.ProductRepository;
import repository.SizeRepository;
import repository.StockRepository;
import repository.impl.ProductRepositoryImpl;
import repository.impl.SizeRepositoryImpl;
import repository.impl.StockRepositoryImpl;
import service.VisibilidadProductoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisibilidadProductoServiceImpl implements VisibilidadProductoService {

    private ProductRepository productRepository = new ProductRepositoryImpl();
    private StockRepository stockRepository = new StockRepositoryImpl();
    private SizeRepository sizeRepository = new SizeRepositoryImpl();


    @Override
    public List<String> executeAlgorithm() {
        List<Product> products = productRepository.getAll();
        List<Size> sizes = sizeRepository.getAll();

        var result = new ArrayList<Product>();
        products.forEach(product -> {
           var sizesOfProduct = sizes.stream().filter(size -> size.getProductId().equals(product.getId())).collect(Collectors.toList());
           var muestroEspecial = hayStockSpecial(sizesOfProduct);
           if (muestroEspecial){
               result.add(product);
           }else if((sizesOfProduct.stream().anyMatch(this::hayStock))){
               result.add(product);
           }
        });

        return result.stream().map(Product::getId).collect(Collectors.toList());
    }

    private boolean hayStock(Size size) {
        List<Stock> stocks = stockRepository.getAll();
        var stockFiltrado = stocks.stream().filter(stock -> stock.getQuantity()>0).collect(Collectors.toSet());
        return stockFiltrado.stream().anyMatch(stock -> stock.getSizeId().equals(size.getId())) || size.getBackSoon();
    }
    private boolean hayStockSpecial(List<Size> sizes) {
       return sizes.stream().anyMatch(Size::getSpecial) && sizes.stream().filter(size -> !size.getSpecial()).anyMatch(this::hayStock);
    }
}
