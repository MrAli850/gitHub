import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {
       // Kullanıcıdan alınan bir pozitif tam sayının faktöriyelini
        // hesaplayan bir while döngüsü yazın.

        Scanner scanner =new Scanner(System.in);

        System.out.println("Pozitif bir sayı giriniz.");

        int number = scanner.nextInt();

        while (number < 0) {

            System.out.println("negatif bir sayı girdiniz. Lütfen Pozitif Bir Sayı Giriniz");
            number = scanner.nextInt();

        }
        int factorial = 1;
        int sayac = 1;

        while (sayac <= number) {
            factorial *= sayac;
            sayac++;
        }

        System.out.println( number + " Sayısı'nın Faktöriyeli : " + factorial);

    }
}
