import java.util.Scanner;

public class Homework04 {

    public static void main(String[] args) {

        // Kullanıcıdan bir sayı girişi alan ve bu sayının asal olup olmadığını
        // kontrol eden bir do-while döngüsü



        Scanner scanner = new Scanner(System.in);

        int number;

        do {

            System.out.print("Lütfen Bir Sayı Giriniz : ");
            number = scanner.nextInt();

            if (number <= 1) {
                System.out.println("Lütfen 1'den Büyük Bir Sayı Giriniz.");
                continue;
            }

            boolean asalMidir = true;

            for (int i = 2; i <= number / i; i++) {

                if (number % i == 0) {

                    asalMidir = false;

                    break;
                }
            }

            System.out.println(asalMidir ? number + " Sayısı Asaldır." : number + " Sayısı Asal Değildir.");
            
        } while (number <= 1);

    }
}