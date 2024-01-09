import java.util.Scanner;

public class Algorithm01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number2;
        System.out.println("Birinci sayıyı Giriniz");

        int number1 = scanner.nextInt();

        System.out.println("Girilen  Birinci Sayı: " + number1);

        number2 = scanner.nextInt();
        System.out.println("Girilen ikinci sayı: " + number2);

        int toplam = number1+number2;

        System.out.println("Girilen iki sayının toplamı : " + toplam);

        System.out.println("Girilen iki sayının toplamı : "+ (number1 + number2));

        //System.out.println("İki sayının toplamı : " +number1 + number2);



    }

}
