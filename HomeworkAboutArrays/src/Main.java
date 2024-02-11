import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz:");

        int dizininUzunlugu = scanner.nextInt();

        System.out.println("Dizi elemanlarını giriniz:");

        int[] dizi = new int[dizininUzunlugu];

        for (int i = 0; i < dizininUzunlugu; i++) {
            dizi[i] = scanner.nextInt();
        }

        int sonuc = altDiziBul(dizi);

        if (sonuc == 1) {
            System.out.println("Verilen dizide herhangi bir alt dizi bulunamadı.");
        } else {
            System.out.println("Mutlak farkın en fazla 1 olduğu alt dizi sayısı : " + sonuc);
        }
    }

    public static int altDiziBul(int[] dizi) {

        int[] tekrarSayiSayaci = new int[101];

        for (int i = 0; i < dizi.length; i++) {
            tekrarSayiSayaci[dizi[i]]++;
        }

        int maksimumUzunluk = 0;

        for (int i = 1; i <= 100; i++) {
            maksimumUzunluk = Math.max(maksimumUzunluk, tekrarSayiSayaci[i] + tekrarSayiSayaci[i - 1]);
        }

        if (maksimumUzunluk == 1) {
            return maksimumUzunluk;
        }

        return maksimumUzunluk;
    }

        }