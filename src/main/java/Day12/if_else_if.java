package Day12;

import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");

        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Cift sayi");
        }
        if (sayi % 2 != 0) {
            System.out.println("Tek sayi");
        }
        System.out.println("-------------------");
        /*if (){

        }else {

        }*/

        if (sayi % 2 !=0) {
            System.out.println("Tek sayi");
        } else {
            System.out.println("Sayi ciftir");
        }


    }
}
