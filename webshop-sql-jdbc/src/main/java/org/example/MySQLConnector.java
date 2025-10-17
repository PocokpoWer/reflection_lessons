package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnector {

    public static void connectToMySql(String url, String user, String password) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM shop_item;");
             final var content = statement.executeQuery()) {
            System.out.println("Connected to MySql!\n");

            while (content.next()) {

                System.out.println("ID: " + content.getString("id"));
                System.out.println("Name: " + content.getString("item_name"));
                System.out.println("Price: " + content.getString("item_price") + " Ft");
                System.out.println("Quantity: " + content.getString("quantity") + " db");
                System.out.println("Date: " + content.getString("date_added"));
                System.out.println("---");
            }
        } catch (SQLException e) {
            System.err.println("Error connecting to MySql: " + e.getMessage());
        }
    }
}

