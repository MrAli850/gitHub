import java.util.Random;
import java.util.Scanner;

public class ZarOyunu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kullaniciSayisi = 0;

        while (true) {
            System.out.print("Lütfen 4 ile 24 arasında bir sayı giriniz : ");

            kullaniciSayisi = scanner.nextInt();

            if (kullaniciSayisi >= 4 && kullaniciSayisi <= 24) {
                break;
            } else {
                System.out.println("Geçersiz giriş. Lütfen 4 ile 24 arasında bir sayı giriniz : ");
            }
        }
        ZarOyunu zarOyunu = new ZarOyunu();

        zarOyunu.oyna(kullaniciSayisi);
    }
    public void oyna(int kullaniciSayisi) {

        Random random = new Random();

        int toplamKazanc = 0;

        for (int i = 1; i <= 11; i++) {

            int zar1 = random.nextInt(6) + 1;

            int zar2 = random.nextInt(6) + 1;

            int toplamZar = zar1 + zar2;

            int tahminEdilenSayi = tahminEdilenSayiHesapla(toplamZar);

            if (i == 1 || i == 2) {
                if (tahminEdilenSayi == kullaniciSayisi) {
                    toplamKazanc += 3000000;
                }
            } else if (i >= 3 && i <= 6) {
                if (tahminEdilenSayi == kullaniciSayisi) {
                    toplamKazanc += 1000000;
                }
            } else if (i >= 7 && i <= 10) {
                if (tahminEdilenSayi == kullaniciSayisi) {
                    toplamKazanc += 500000;
                }
            } else {
                toplamKazanc += 50;
            }
        }
        System.out.println("Toplam kazanç : " + toplamKazanc + " dolardır");
    }
    public int tahminEdilenSayiHesapla(int toplamZar) {

        return toplamZar * 2;
    }
}