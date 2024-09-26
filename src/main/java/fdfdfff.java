import java.util.Scanner;

public class fdfdfff {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyyetinizi giriniz");
        String gender = input.next();

        System.out.println("Yasinizi giriniz");
        int age = input.nextInt();


        if (gender.equalsIgnoreCase("Erkek")) {

            if (age < 0) {
                System.out.println("Yas negativ olamaz");
            } else if (age < 16) {
                System.out.println("Calismamali");
            } else if (age <= 65) {
                System.out.println("Calismali");
            } else {
                System.out.println("Emekli olmali");
            }

        } else if (gender.equalsIgnoreCase("Kadin")) {

            if (age < 0) {
                System.out.println("Yas negativ olamaz");
            } else if (age < 18) {
                System.out.println("Calismamali");
            } else if (age <= 60) {
                System.out.println("Calismali");
            } else {
                System.out.println("Emekli olmali");
            }

        } else {
            System.out.println("Sizin icin farkli bir tanimlama yapilmadi");
        }








    }
}
