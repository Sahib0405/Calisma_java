package Day12;

import java.util.Scanner;

public class OverFlow {
    public static void main(String[] args) {
        /*
        Verilen iki reqemin (sifrdan boyuk ve sifra beraber)
        toplamini hesablayan ve yazdirin bir java programi yazin.
        Verilen tam reqemler veya toplam 10dan cox basamakli olarsa overflov yazdirin.
        Misal:
        Input:
        25
        46
        Output:
        Reqemlerin toplami:
        71
         */

     Scanner scan = new Scanner(System.in);
        System.out.println("Sifirdan boyuk ve sifra beraber iki reqem yazin");

        int reqem1 = scan.nextInt();
        int reqem2 = scan.nextInt();
        int toplama = 0;

        if (reqem1 >=0 && reqem2 >= 0) {
            if (!(reqem1 > 999999999) && !(reqem2 > 999999999)){
                toplama= reqem2+reqem1;
            } else System.out.println("Overflow");

            }

        System.out.println("Reqmlerin toplami =" + toplama);








    }
}
