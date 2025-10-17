package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/resources/application.yml"));
        String url = prop.getProperty("connection-string");
        String user = prop.getProperty("username");
        String password = prop.getProperty("password");
        MySQLConnector.connectToMySql(url, user, password);
        ProductMenu.showMenu(url, user, password);
    }
}