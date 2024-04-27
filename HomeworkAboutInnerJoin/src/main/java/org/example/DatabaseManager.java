package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/ali_dbase";
    static final String USER = "postgres";
    static final String PASSWORD = "123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public static void createTables() {
        try (Connection connection = getConnection()) {
            String createCustomersTableQuery = "CREATE TABLE IF NOT EXISTS Customers (" +
                    "Customer_id SERIAL PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "surname VARCHAR(100)," +
                    "email VARCHAR(100)" +
                    ")";

            String createProductsTableQuery = "CREATE TABLE IF NOT EXISTS Products (" +
                    "Product_id SERIAL PRIMARY KEY," +
                    "Product_Name VARCHAR(100)," +
                    "Price INTEGER" +
                    ")";

            String createOrdersTableQuery = "CREATE TABLE IF NOT EXISTS Orders (" +
                    "Order_id SERIAL PRIMARY KEY," +
                    "Customer_id INT," +
                    "Product_id INT," +
                    "FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)," +
                    "FOREIGN KEY (product_id) REFERENCES Products(product_id)" +
                    ")";

            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createCustomersTableQuery);
                statement.executeUpdate(createProductsTableQuery);
                statement.executeUpdate(createOrdersTableQuery);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
