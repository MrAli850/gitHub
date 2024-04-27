package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderManager {
    public static void insertOrder(int customerId, int productId) {
        String insertOrderQuery = "INSERT INTO Orders (Customer_id, Product_id) VALUES (?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertOrderQuery)) {
            preparedStatement.setInt(1, customerId);
            preparedStatement.setInt(2, productId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
