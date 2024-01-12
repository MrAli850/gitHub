public class Homework03 {

    public static void main(String[] args) {

        // Do-while döngüsü kullanarak, 5'e bölünebilen sayıları 1'den 50'ye kadar
        // olan aralıkta ekrana yazdıran bir Java programı.

        int number = 1;
        int besSayaci = 0;


        do {

            if(number % 5 == 0) {
                besSayaci++;
                System.out.println(number);
                
            }


            number++;
        }while (number <= 50);

        System.out.println(" \n Toplamda " + besSayaci + " adet 5'e Tam Bölünebilen Sayı Vardır.");


    }
}
