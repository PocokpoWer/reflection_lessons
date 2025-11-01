package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Properties prop = new Properties();
        prop.load(new FileReader("src/main/resources/application.yml"));
        String url = prop.getProperty("connection-string");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        ConnectionManager connectionManager = new ConnectionManager(url, username, password);
        PersonManager personManager = new PersonManager(connectionManager.getConnection());
        new PersonController(personManager).start();
    }
}