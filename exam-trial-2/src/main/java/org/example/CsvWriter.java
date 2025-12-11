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

public class CsvWriter implements UserWriter {
    @Override
    public void write(List<User> list, Path path) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {
        Writer csvWriter = new FileWriter(path.toString());
        StatefulBeanToCsv<User> beanToCsv = new StatefulBeanToCsvBuilder<User>(csvWriter).build();
        beanToCsv.write(list);
    }
}
