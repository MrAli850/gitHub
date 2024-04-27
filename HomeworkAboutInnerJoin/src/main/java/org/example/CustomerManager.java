package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerManager {
    public static void insertCustomer(String name, String surname, String email) {
        String insertCustomerQuery = "INSERT INTO Customers (name, surname, email) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseManager.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertCustomerQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, email);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteCustomer(int customerId) {
        try (Connection connection = DatabaseManager.getConnection()) {
            connection.setAutoCommit(false);

            String deleteOrdersQuery = "DELETE FROM orders WHERE customer_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteOrdersQuery)) {
                preparedStatement.setInt(1, customerId);
                preparedStatement.executeUpdate();
            }

            String deleteCustomerQuery = "DELETE FROM customers WHERE customer_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteCustomerQuery)) {
                preparedStatement.setInt(1, customerId);
                preparedStatement.executeUpdate();
            }

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
