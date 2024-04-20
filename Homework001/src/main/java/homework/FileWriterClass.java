package homework;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class FileWriterClass {
    public static void writeToFile() {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ali_db",
                    "postgres",
                    "123");


            String sql = "SELECT * FROM information";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);


            FileWriter writer = new FileWriter("personalInformation.txt");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                String phoneNumber = resultSet.getString("phone_number");
                String gender = resultSet.getString("gender");

                String line = String.format("Name: %s, Surname: %s, Age: %d, Phone number: %s, Gender: %s%n", name, surname, age, phoneNumber, gender);
                writer.write(line);
            }

            writer.close();
            connection.close();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}

