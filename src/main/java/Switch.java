import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Kecerli yas giriniz");
        } else if (age < 5) {
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31){
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tamamlanmamis yas");
        }


    }
}
