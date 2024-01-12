public class Homework07 {

    public static void main(String[] args) {
        // Bir do-while döngüsü kullanarak, 1 ile 50 arasındaki
        // sayıların karelerini ekrana yazdıran bir Java kodu

        int number = 1;

        System.out.println(" 1 ile 50 Arasındaki Sayıların Kareleri : ");

        do {
            int kare = number * number;

            System.out.println( number + "nin karesi : " + kare);
            number++;
        } while ( number <= 50);


    }
}
