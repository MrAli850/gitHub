import java.util.Scanner;

public class Homework05 {

    public static void main(String[] args) {

        // Kullanıcıdan alınan bir pozitif sayının çift veya tek olduğunu belirleyen
        // bir if-else ifadesi içeren bir for döngüsü yazın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz.");

        int number = scanner.nextInt();

        for (int i = 0; i < 1; i++) {

            if (number % 2 == 0) {
                System.out.println("Girdiğiniz Sayı Çift Sayıdır.");

            } else {
                System.out.println("Girdiğiniz Sayı Çift Sayı Değildir.");

            }
        }
    }
}
