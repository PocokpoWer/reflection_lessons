package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    private String name;
    private int age;
    private String department;
    private double salary;
}
