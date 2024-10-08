package Day12;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(101);


        int denemeSayisi = 0;
        int tahminEdilen ;
        boolean tahminDogrumu = false;
        //--------------------------
        System.out.println("0-100 arasinda bir sayiyi tahmin etmeye calisin");

        do {
            System.out.println("Tahmininizi yapiniz");
            tahminEdilen = scanner.nextInt();
            denemeSayisi++;

            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayi daha boyuk");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayi daha kucuk");
            } else {tahminDogrumu = true;
                System.out.println("Tebrikler, dogru");
                System.out.println("Deneme sayisi: " + denemeSayisi);
            }

        } while (!tahminDogrumu);








    }
}
