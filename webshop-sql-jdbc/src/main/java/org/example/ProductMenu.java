package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Properties;

public class ProductMenu {

    public static void showMenu(String url, String user, String password) throws SQLException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.printf("Please select:\n" +
                "1 -> Add new product with today's date\n" +
                "2 -> Add a product with date\n" +
                "3 -> Delete product by name\n" +
                "4 -> Delete product by type\n" +
                "5 -> Update a product by ID\n");

        int userInput = Integer.parseInt(br.readLine());

        switch (userInput) {
            case 1:
                WebshopService.addProductWithTodayDate(br, connection);
                break;
            case 2:
                WebshopService.addProductWithDate(br, connection);
                break;
            case 3:
                WebshopService.deleteProductByName(br, connection);
                break;
            case 4:
                WebshopService.deleteProductByType(br, connection);
                break;
            case 5:
                WebshopService.updateProductById(br, connection);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
