import java.util.Scanner;

public class ifelseif03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5saydan birini girin");

        double sumdouble = input.nextDouble();
        int sum = (int) sumdouble;

        if (sumdouble != sum){
            System.out.println("lutfen tam sayi giriniz");
        } else {
            if (sum <= 0){
                System.out.println("0 dan kicik olmaz");
            } else if (sum == 1){
                System.out.println("hec bir qiymet yoxdur");
            } else if (sum == 2){
                System.out.println("cox zeifsiniz");
            } else if (sum == 3){
                System.out.println("Kafi sayilir");
            } else if (sum == 4) {
                System.out.println("Yaxsi aldiniz");
            } else if (sum == 5){
                System.out.println("Elasiniz");
            } else {
                System.out.println("Siz 5den boyuk reqem girdiniz");
            }
        }



        short say = 32000;
        int say1 = say;
        say1 = 320000000;


        int nm = 45;
        Integer nm1 = nm;

        Long dh = 456454L;
        long dh1 = dh;









    }
}
