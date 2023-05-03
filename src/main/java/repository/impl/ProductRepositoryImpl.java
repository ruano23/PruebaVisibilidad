package repository.impl;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import domain.Product;
import repository.ProductRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> getAll() {

        try {
           MappingIterator<Product> productIter = new CsvMapper().readerWithTypedSchemaFor(Product.class).readValues(new File("product.csv"));
           return productIter.readAll();
        } catch (IOException e) {
            throw new NoSuchElementException(e.getMessage());
        }

    }
}
