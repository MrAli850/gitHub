package com.example.HomeworkAboutInnerJoinWithSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Main implements CommandLineRunner {

	private final Scanner scanner = new Scanner(System.in);

	@Autowired private CustomerService customerService;

	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) {
		while (true) {
			System.out.println("Ne yapmak istiyorsunuz?");
			System.out.println("1. Müşteri Ekle");
			System.out.println("2. Ürün Ekle");
			System.out.println("3. Sipariş Ekle");
			System.out.println("4. Tüm ürünleri Göster");
			System.out.print("Seçiminiz: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					addCustomer();
					break;
				case 2:
					addProduct();
					break;
				case 3:
					addOrder();
					break;
				case 4:
					showAllProducts();
					break;
				default:
					System.out.println("Geçersiz bir tuşa bastınız. Lütfen tekrar deneyiniz.");
			}

			System.out.print("Devam etmek istiyor musunuz? (E/H) ?");

			String reader = scanner.nextLine();
			if (!reader.equalsIgnoreCase("E")) {
				break;
			}
		}
	}

	private void addCustomer() {
		System.out.print("Müşteri adı: ");
		String name = scanner.nextLine();
		System.out.print("Müşteri soyadı: ");
		String surname = scanner.nextLine();
		System.out.print("Müşteri email: ");
		String email = scanner.nextLine();

		customerService.createCustomer(name, surname, email);
		System.out.println("Müşteri başarıyla eklendi.");
	}

	private void addProduct() {
		System.out.print("Ürün adı: ");
		String name = scanner.nextLine();
		System.out.print("Ürün fiyatı: ");
		int price = scanner.nextInt();
		scanner.nextLine();

		productService.createProduct(name, price);
		System.out.println("Ürün başarıyla eklendi.");
	}

	private void addOrder() {
		System.out.print("Müşteri ID: ");
		Long customerId = scanner.nextLong();
		scanner.nextLine();
		System.out.print("Ürün ID: ");
		Long productId = scanner.nextLong();
		scanner.nextLine();

		CustomerEntity customer = customerService.getCustomerById(customerId);
		ProductEntity product = productService.getProductById(productId);

		if (customer == null || product == null) {
			System.out.println("Müşteri veya ürün bulunamadı.");
			return;
		}

		orderService.createOrder(customerId, productId);
		System.out.println("Sipariş başarıyla eklendi.");
	}

	private void showAllProducts() {
		List<ProductEntity> products = productService.getAllProducts();

		if (products.isEmpty()) {
			System.out.println("Mevcut ürün bulunamadı.");
		} else {
			System.out.println("Mevcut ürünler:");
			for (ProductEntity product : products) {
				System.out.println("Ürün adı: " + product.getName() + ", Fiyatı: " + product.getPrice());
			}
		}
	}
}

