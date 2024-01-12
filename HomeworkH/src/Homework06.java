public class Homework06 {

    public static void main(String[] args) {

// Bir while döngüsü kullanarak, 1'den başlayarak Fibonacci dizisinin
// ilk 10 terimini ekrana yazdıran bir Java programı nasıl yazılır?

        int n = 10;

        int sayac = 0;

        int a = 0, b = 1;

        System.out.println("Fibonacci Dizisi'nin İlk " + n + " Terimi:");

        while (sayac < n) {

            System.out.println( a + " ");

            int y = a + b;

            a = b;

            b = y;

            sayac++;
        }

    }
}
