package org.example;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface UserWriter {
    void write(List<User> list, Path path) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException;
}
