package org.example;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.List;

public class CsvWriter {
    public void writeCsv(List<User> inputLines, Path path) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {
        try (Writer csvWriter = new FileWriter(path.toString())) {
            StatefulBeanToCsv<User> beanToCsv = new StatefulBeanToCsvBuilder<User>(csvWriter).build();
            beanToCsv.write(inputLines);
        }
    }
}
