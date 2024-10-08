package Day12;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        //String m = "Ali Can Kahraman";
        String s = "Learn Java earn 1234 money";

        //String s6 = s.replaceAll("[0-9]" , "*");
        //System.out.println(s6);

       // int num = s.replaceAll("[^0-9]" , "").length();
      //  System.out.println(num);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        boolean lengthControl = pwd.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);

        //boolean spaceControl = pwd.replaceAll("[^ ]" , "").length() == 0;
        // boolean spaceControl = pwd.replaceAll("[^ ]" , "").isEmpty();
        boolean spaceControl = !pwd.contains(" ");
        //System.out.println("spaceControl = " + spaceControl);
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]" , "").length() > 0;
        //System.out.println("upperCaseControl = " + upperCaseControl);
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]" , "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);
        if (!lowerCaseControl){
            System.out.println("En azi bir tane kucuk harf olmali");
        }
        boolean digitControl = pwd.replaceAll("[^0-9]" , "").length() > 0;
        //System.out.println("digitControl = " + digitControl);
        if (!digitControl){
            System.out.println("Sifre en az bir raqam icermelidir");
        }
        boolean sumvolControl = pwd.replaceAll("[^\\p{Punct}]" , "").length() > 0;
        // System.out.println("sumvolControl = " + sumvolControl);

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && sumvolControl;

        if (isValid){
            System.out.println("Sifre gecerlidir");

        }else {
            System.out.println("Sifre gecersizdir");
        }













    }
}
