import java.util.Scanner;

public class fgfhgf02 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("Lutfen baslangiz ay numarasini giriniz");
    byte monthsName = input.nextByte();

    switch (monthsName){
        case 1:
            System.out.println("Yanvar");
        case 2:
            System.out.println("Fevral");
        case 3:
            System.out.println("Mart");
        case 4:
            System.out.println("Aprel");
        case 5:
            System.out.println("May");
        case 6:
            System.out.println("Iyun");
        case 7:
            System.out.println("Iyul");
        case 8:
            System.out.println("Avqust");
        case 9:
            System.out.println("Sentyabr");
        case 10:
            System.out.println("Oktyabr");
        case 11:
            System.out.println("Noyabr");
        case 12:
            System.out.println("Dekabr");
            break;
        default:
            System.out.println("Gecerli bir ay sayisi giriniz");
    }




    }
}
