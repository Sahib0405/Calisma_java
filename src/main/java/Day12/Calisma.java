package Day12;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {


    /* Istifadiceye kilosunun ve boyunu sorusun ve kutle indeksini hesablayan bir program yazin. BMI
    ip ucu: BMI =  agirliq (kq) / boy * boy (m)
    BMI 18,5 in asagisndadirsa zeifsiniz.
    BMI 18,5 ile 25 arsindadirsa kilonuz idealdir.
    BMI 25-30 arasindadirsa koksunuz.
    BMI 30boyuk veya beraberdirse obezsiniz.
    Input:
    Output:

     */

        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu ve boyunuz giriniz");


        double weight = input.nextDouble();
        double height = input.nextDouble();
        double BMI = weight / (height * height);

        System.out.println(BMI);

        if (BMI < 18.5) {
            System.out.println("Zeifsiniz");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Cekiniz idealdir");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Koksunuz");
        } else if (BMI>= 30) {
            System.out.println("Obezsiniz");
        }
        System.out.println("BMI = " + BMI);



    }
}
