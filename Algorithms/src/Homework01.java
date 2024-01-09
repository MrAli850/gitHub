import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");

        int sayi1 = scanner.nextInt();

        System.out.println("Girilen birinci sayınız : " + sayi1);

        System.out.println("İkinci sayıyı giriniz");

        int sayi2 = scanner.nextInt();

        System.out.println("Girilen İkinci sayınız : " + sayi2);

        System.out.println("");

        int toplama = sayi1 + sayi2;
        int carpim = sayi1 * sayi2;
        int bolme = sayi1 / sayi2;
        int cikarma = sayi1 - sayi2;

        System.out.println("Toplama işlem sonucunuz : " +toplama);
        System.out.println("Çarpma işlem sonucunuz : " +carpim);
        System.out.println("Bölme işlem sonucunuz : " +bolme);
        System.out.println("Çıkarma işlem sonucunuz : " +cikarma);

    }
}
