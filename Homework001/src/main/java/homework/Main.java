package homework;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/ali_db";
        String username = "postgres";
        String password = "123";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Adınızı Giriniz: ");
            String name = scanner.nextLine();

            System.out.print("Soyadınızı Giriniz: ");
            String surname = scanner.nextLine();

            System.out.print("Yaşınızı Giriniz: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Telefon Numaranızı Giriniz: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Cinsiyetinizi Giriniz: ");
            String gender = scanner.nextLine();

            String sql = "INSERT INTO information (name, surname, age, phone_number, gender) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, phoneNumber);
            preparedStatement.setString(5, gender);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Girilen Veriler Veritabanına Başarıyla Eklendi");
            }


            FileWriterClass.writeToFile(connection);

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




