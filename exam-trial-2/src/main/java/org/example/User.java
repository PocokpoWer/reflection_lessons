package org.example;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    @CsvBindByPosition(position = 0)
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByPosition(position = 1)
    @CsvBindByName(column = "age")
    private int age;
    @CsvBindByPosition(position = 2)
    @CsvBindByName(column = "department")
    private String department;
    @CsvBindByPosition(position = 3)
    @CsvBindByName(column = "salary")
    private double salary;
}
