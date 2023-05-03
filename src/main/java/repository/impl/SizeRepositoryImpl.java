package repository.impl;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import domain.Size;
import repository.SizeRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

public class SizeRepositoryImpl implements SizeRepository {
    @Override
    public List<Size> getAll() {

        try {
           MappingIterator<Size> sizeIter = new CsvMapper().readerWithTypedSchemaFor(Size.class).readValues(new File("size.csv"));
           return sizeIter.readAll();
        } catch (IOException e) {
            throw new NoSuchElementException(e.getMessage());
        }

    }
}
