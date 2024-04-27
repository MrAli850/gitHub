package org.example;

import java.sql.*;

public class ProductManager {
    public static void insertProduct(String Product_Name, int price) {
        String insertProductQuery = "INSERT INTO Products (Product_Name, Price) VALUES (?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertProductQuery)) {
            preparedStatement.setString(1, Product_Name);
            preparedStatement.setInt(2, price);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void showAllProducts() {
        String query = "SELECT * FROM products";
        try (Connection connection = DatabaseManager.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                int price = resultSet.getInt("price");
                System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: " + price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
