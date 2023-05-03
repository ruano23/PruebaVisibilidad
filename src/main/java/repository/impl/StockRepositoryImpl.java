package repository.impl;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import domain.Stock;
import repository.StockRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public class StockRepositoryImpl implements StockRepository {
    @Override
    public List<Stock> getAll() {

        try {
           MappingIterator<Stock> stockIter = new CsvMapper().readerWithTypedSchemaFor(Stock.class).readValues(new File("stock.csv"));
           return stockIter.readAll();
        } catch (IOException e) {
            throw new NoSuchElementException(e.getMessage());
        }

    }
}
