import java.util.Scanner;

public class homework02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");

        int adet = scanner.nextInt();

        int[] sayilar = new int[adet];

        for (int i = 0; i < adet; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextInt();
        }

        int toplam = 0;

        for (int sayi : sayilar) {

            toplam += sayi;
        }

        double ortalama = (double) toplam / adet;

        System.out.println();

        System.out.println("Girilen sayıların toplamı: " + toplam);

        System.out.println();

        System.out.println("Girilen sayıların ortalaması: " + ortalama);

        System.out.println();

        System.out.println("Tek sayılar:");

        for (int sayi : sayilar) {
            if (sayi % 2 != 0) {
                System.out.print(sayi + " ");
            }
        }

        System.out.println(" ");
        System.out.println("Çift sayılar:");

        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                System.out.print(sayi + " ");
            }
        }


    }
}