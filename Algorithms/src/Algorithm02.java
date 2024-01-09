import java.util.Scanner;

public class Algorithm02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Sıfırdan Farklı Birinci sayıyı giriniz");

        int number1 = scanner.nextInt();

        System.out.println("Girilen birinci sayı : " + number1);

        System.out.println("Sıfırdan Farklı İkinci sayıyı giriniz");

        int number2 = scanner.nextInt();

        int toplam = number1 + number2;

        System.out.println("Girilen ikinci sayı : " + number2);

        //       if(number1 == 0) {
        //          System.out.println("Maalesef siz 0 girdiniz. Uygulama kapatılıyor");
        //          System.exit(-1);
        //
        //      }

        //      if(number2 == 0) {
        //          System.out.println("Maalesef siz 0 girdiniz. Uygulama kapatılıyor");
        //         System.exit(-1);
        //     }


        if (number1 == 0 || number2 == 0) {
            System.out.println("Maalesefsiz 0 girdiniz. Uygulama Kapatılıyor.");
        }
        toplam = number1 + number2;

        System.out.println("sıfırdan farklı iki sayının toplamı : " + toplam);


    }
}
