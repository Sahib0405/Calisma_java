package Day12;

import java.util.Scanner;

public class DoWhileLoops02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        do {
            if (counter == 4){
                System.out.println("Hesabiniz bloke olmusdur");
                break;
            }
            System.out.println("Lutfen username giriniz");
            String username = input.next();

            System.out.println("Lutfen password giriniz");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza hos geldiniz");
                break;
            }counter++;
        } while (true);









    }
}
