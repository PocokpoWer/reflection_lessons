package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class WebshopService {

    protected static void addProductWithTodayDate(BufferedReader br, Connection connection) throws SQLException, IOException {
        String userQuery = "INSERT INTO shop_item (item_name, item_price, quantity) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("Write the product name: ");
        statement.setString(1, br.readLine());
        System.out.println("Write the price: ");
        statement.setInt(2, Integer.parseInt(br.readLine()));
        System.out.println("Write the quantity: ");
        statement.setInt(3, Integer.parseInt(br.readLine()));
        statement.executeUpdate();
        System.out.println("Added product!");
    }

    protected static void addProductWithDate(BufferedReader br, Connection connection) throws SQLException, IOException {
        String userQuery = "INSERT INTO shop_item (item_name, item_price, quantity, date_added) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("Write the product name: ");
        statement.setString(1, br.readLine());
        System.out.println("Write the price: ");
        statement.setInt(2, Integer.parseInt(br.readLine()));
        System.out.println("Write the quantity: ");
        statement.setInt(3, Integer.parseInt(br.readLine()));
        System.out.println("Write the date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(br.readLine());
        statement.setDate(4, Date.valueOf(date));
        statement.executeUpdate();
        System.out.println("Added product!");
    }

    protected static void deleteProductByName(BufferedReader br, Connection connection) throws SQLException, IOException {
        String userQuery = "UPDATE shop_item SET quantity = quantity - ? WHERE item_name = ?";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("How many want you delete: ");
        statement.setInt(1, Integer.parseInt(br.readLine()));
        System.out.println("Write the product name: ");
        statement.setString(2, br.readLine());
        statement.executeUpdate();
        System.out.println("Deleted product!");
    }

    protected static void deleteProductByType(BufferedReader br, Connection connection) throws SQLException, IOException {
        String userQuery = "DELETE FROM shop_item WHERE item_name = ?";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("Write the product name: ");
        statement.setString(1, br.readLine());
        statement.executeUpdate();
        System.out.println("Deleted product!");
    }

    protected static void updateProductById(BufferedReader br, Connection connection) throws SQLException, IOException {
        String userQuery = "UPDATE shop_item SET item_name = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("Write the product id number: ");
        statement.setInt(2, Integer.parseInt(br.readLine()));
        System.out.println("Write the product new name: ");
        statement.setString(1, br.readLine());
        statement.executeUpdate();
        System.out.println("Update finished!");
    }
}
