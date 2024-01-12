import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Homework01 {
    public static void main(String[] args) {
// Bir for döngüsü kullanarak 1 ile 100 arasındaki çift sayıları ekrana yazdıran Java kodu

        Scanner scanner = new Scanner(System.in);
        int ciftSayac = 0;
        for (int i = 1; i <= 80; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                ciftSayac++;




            }

        }
        System.out.println("Toplamda "+ ciftSayac + " Adet Çift Sayı Vardır.");
    }
}
