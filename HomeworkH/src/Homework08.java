import java.util.Scanner;

public class Homework08 {

    public static void main(String[] args) {

        // Kullanıcıdan alınan bir sayının asal çarpanlarını bulan
        // bir do-while döngüsü içeren bir Java programı nasıl yazılır?

        Scanner scanner = new Scanner(System.in);

        int number;

        int carpan = 2;

        do {
            System.out.print("Bir sayı girin: ");

            number = scanner.nextInt();

            if (number == 0) {

                System.out.println("Lütfen Sıfır'dan Farklı Bir Sayı Giriniz..");
            }

        } while (number == 0);

        System.out.print("Asal çarpanlar: ");

        while (carpan <= number) {

            if (number % carpan == 0) {

                System.out.print(carpan + " " );

                number /= carpan;

            } else {

                carpan++;
            }
        }
    }
}
