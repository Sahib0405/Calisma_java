import java.util.Scanner;

public class SwiychNew {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ay rəqəmlərini giriniz");
        int month = input.nextInt();

        String season = switch (month){
            case 12,1,2 -> "kis";
            case 3,4,5 -> "Yaz";
            case 6,7,8 -> "Yay";
            case 9,10,11 -> "Payiz";
            default -> "Bilinmeyen ay";
        };
        System.out.println("Movsum: " + season);


        input.close();








    }
}
