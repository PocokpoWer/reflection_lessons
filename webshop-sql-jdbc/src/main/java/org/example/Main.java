package org.example;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private static String url = "jdbc:mysql://localhost/webshop";
    private static String user = "root";
    private static String password = "root";
    private static Connection connection;
    private static Scanner scanner = new Scanner(System.in);

    static {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Error connecting to MySql: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {

        ConnectToMySql.connectToMySql(url, user, password);

        System.out.printf("Please select:\n" +
                "1 -> Add new product with today's date\n" +
                "2 -> Add a product with date\n" +
                "3 -> Delete product by name\n" +
                "4 -> Delete product by type\n" +
                "5 -> Update a product by ID\n");

        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                addProductDateNow();
                break;
            case 2:
                addProductWithDate();
                break;
            case 3:
                deleteProductByName();
                break;
            case 4:
                deleteProductByType();
            case 5:
                updateProductById();
                break;
        }
        ConnectToMySql.connectToMySql(url, user, password);
        scanner.close();
    }

    private static void addProductDateNow() throws SQLException {
        String userQuery = "INSERT INTO shop_item (item_name, item_price, quantity) VALUES (?, ?, ?)";
        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("Write the product name: ");
        statement.setString(1, String.valueOf(scanner.next()));
        scanner.nextLine();
        System.out.println("Write the price: ");
        statement.setInt(2, scanner.nextInt());
        System.out.println("Write the quantity: ");
        statement.setInt(3, scanner.nextInt());
        statement.executeUpdate();
        System.out.println("Added product!");
    }

    private static void addProductWithDate() throws SQLException {
        String userQuery = "INSERT INTO shop_item (item_name, item_price, quantity, date_added) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("Write the product name: ");
        statement.setString(1, String.valueOf(scanner.next()));
        scanner.nextLine();
        System.out.println("Write the price: ");
        statement.setInt(2, scanner.nextInt());
        System.out.println("Write the quantity: ");
        statement.setInt(3, scanner.nextInt());
        scanner.nextLine();
        System.out.println("Write the date (yyyy-mm-dd): ");
        LocalDate date = LocalDate.parse(scanner.next());
        statement.setDate(4, Date.valueOf(date));
        statement.executeUpdate();
        System.out.println("Added product!");
    }

    private static void deleteProductByName() throws SQLException {
        String userQuery = "UPDATE shop_item SET quantity = quantity - ? WHERE item_name = ?";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("How many want you delete: ");
        statement.setInt(1, scanner.nextInt());
        System.out.println("Write the product name: ");
        statement.setString(2, scanner.next());
        statement.executeUpdate();
        System.out.println("Deleted product!");
    }

    private static void deleteProductByType() throws SQLException {
        String userQuery = "DELETE FROM shop_item WHERE item_name = ?";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        System.out.println("Write the product name: ");
        statement.setString(1, scanner.next());
        statement.executeUpdate();
        System.out.println("Deleted product!");
    }

    private static void updateProductById() throws SQLException {
        String userQuery = "UPDATE shop_item SET item_name = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(userQuery);
        statement.setString(1, scanner.next());
        statement.setInt(2, scanner.nextInt());
        statement.executeUpdate();
        System.out.println("Update finished!");
    }
}