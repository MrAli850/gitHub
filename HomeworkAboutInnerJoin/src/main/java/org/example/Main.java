package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseManager.createTables();

        Scanner scanner = new Scanner(System.in);

        String answer;

        do {
            System.out.println("Ne yapmak istersiniz?");
            System.out.println("1. Müşteri Ekle");
            System.out.println("2. Ürün Ekle");
            System.out.println("3. Sipariş Ekle");
            System.out.println("4. Müşteri ve Siparişleri Sil");
            System.out.println("5. Tüm Ürünleri Listele");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    addProduct(scanner);
                    break;
                case 3:
                    addOrder(scanner);
                    break;
                case 4:
                    deleteCustomerAndOrders(scanner);
                    break;
                case 5:
                    showAllProducts();
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
            }

            System.out.print("Devam etmek istiyor musunuz? (Evet/Hayır): ");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("Evet"));

        scanner.close();
    }

    public static void addCustomer(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Müşteri Adı: ");
        String customerName = scanner.nextLine();
        System.out.print("Müşteri Soyadı: ");
        String customerSurname = scanner.nextLine();
        System.out.print("Müşteri Email: ");
        String customerEmail = scanner.nextLine();
        CustomerManager.insertCustomer(customerName, customerSurname, customerEmail);
    }

    public static void addProduct(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Ürün Adı: ");
        String productName = scanner.nextLine();
        System.out.print("Ürün Fiyatı: ");
        int productPrice = scanner.nextInt();
        ProductManager.insertProduct(productName, productPrice);
    }

    public static void addOrder(Scanner scanner) {
        System.out.print("Müşteri ID'sini Giriniz: ");
        int customerId = scanner.nextInt();
        System.out.print("Ürün ID'sini Giriniz: ");
        int productId = scanner.nextInt();
        OrderManager.insertOrder(customerId, productId);
    }

    public static void deleteCustomerAndOrders(Scanner scanner) {
        System.out.print("Müşteri ID'sini Giriniz: ");
        int customerId = scanner.nextInt();
        CustomerManager.deleteCustomer(customerId);
        System.out.println("Müşteri ve siparişleri başarıyla silindi.");
    }

    public static void showAllProducts() {
        ProductManager.showAllProducts();
    }
}



