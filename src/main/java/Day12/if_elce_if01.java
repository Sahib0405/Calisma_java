package Day12;

import java.util.Scanner;

public class if_elce_if01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun sayini giriniz");

        double numdouble = input.nextDouble();
        int num = (int)numdouble;

        if (numdouble != num) {
            System.out.println("Lutfen bir tam sayi giriniz");
        } else {

            if (num <= 0){
                System.out.println("Gun sayilari 1-den kucuk olamaz");
            } else if(num == 1){
                System.out.println("Sunday");
            } else if (num == 2) {
                System.out.println("Monday");
            } else if (num == 3) {
                System.out.println("Tuesday");
            } else if (num == 4) {
                System.out.println("Wednesday");
            } else if (num == 5) {
                System.out.println("Thursaday");
            } else if (num == 6) {
                System.out.println("Friday");
            } else if (num == 7) {
                System.out.println("Saurday");
            }  else {
                System.out.println("Lutfen sayilari 7-den boyuk olamaz");
            }
        }





    }
}
