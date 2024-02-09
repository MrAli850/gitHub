package HomeworkAboutBirds;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = 0;

        System.out.print("Kuş gözlemlerinizi tek boşluk ile ayırarak giriniz : ");
        String[] gorunum = scanner.nextLine().split(" ");
        int n = gorunum.length;
        int[] gorunumler = new int[n];
        for (int i = 0; i < n; i++) {
            gorunumler[i] = Integer.parseInt(gorunum[i]);
        }

        int[] sayac = new int[6];

        for (int kusTuru : gorunumler) {
            sayac[kusTuru]++;
        }

        int enKucukTur = Integer.MAX_VALUE;

        for (int i = 1; i < sayac.length; i++) {
            if (sayac[i] > maxNumber) {
                maxNumber = sayac[i];
                enKucukTur = i;
            } else if (sayac[i] == maxNumber && i < enKucukTur) {
                enKucukTur = i;
            }
        }

        System.out.println("En sık görülen kuş türü : " + enKucukTur);
    }
}