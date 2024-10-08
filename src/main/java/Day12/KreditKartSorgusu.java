package Day12;

import java.util.Scanner;

public class KreditKartSorgusu {
    public static void main(String[] args) {

//        int multiply = 1;
//        for (int i = 10; i > 6; i--) {
//            multiply = (multiply * i);
//
//        }
//        System.out.println(multiply);
//
//        for (int i = 1; i < 5; i++) {
//            System.out.println("Week: " + i);
//            for (int j = 1; j < 8; j++) {
//                System.out.println(" Day: " + j);
//            }
//        }

//      double num = 28.587;
//      String sNum = String.valueOf(num);
//      String decimalPart = sNum.split("[\\.]")[1];
//      int intDecimalPart = Integer.valueOf(decimalPart);
//
//      int sum = 0;
//
//        for (int i = intDecimalPart; i >0 ; i=i/10) {
//            sum = sum +i % 10;
//
//        }
//        System.out.println(sum);
//
//        for (int i = 3; i < 7; i++) {
//            System.out.println(i);
//        }
//        System.out.println("--------------------");
//        int i = 3;
//        while (i < 7) {
//            System.out.println(i);
//            i++;
//        }
//
//        int k = 23;
//        while (k > 11) {
//            if (k % 2 == 0) {
//                System.out.println(k);
//            }
//            k--;
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Vurma Cedveli");
        int num = input.nextInt();

        int i = 0;
        while (i <= 10) {
            System.out.println(num + "x" + i + " = " + (num * i));
            i++;
        }


    }
}
