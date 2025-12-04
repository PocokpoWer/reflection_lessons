package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> peoples = new ArrayList<>();
        User user = User.builder()
                .name("Tibor")
                .age(18)
                .department("Driver")
                .salary(700000)
                .build();
        peoples.add(new User());
    }
}