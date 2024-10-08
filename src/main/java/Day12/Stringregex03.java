package Day12;

import java.util.Scanner;

public class Stringregex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sifrenizi giriniz");
        String pwd = input.nextLine();

        boolean lengtControl = pwd.length() > 7 && pwd.length() <12;
        //System.out.println("lengtControl = " + lengtControl);
        // boolean spaceControl = pwd.replaceAll("[^ ]" , "").length()==0;
        //boolean spaceControl = pwd.replaceAll("[^ ]" , "").isEmpty();
        boolean spaceControl = !pwd.contains(" ");
        //System.out.println("spaceControl = " + spaceControl);

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() >0;
       // System.out.println("upperCaseControl = " + upperCaseControl);

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() >0;
       // System.out.println("lowerCaseControl = " + lowerCaseControl);

        boolean digitCaseControl = pwd.replaceAll("[^0-9]", "").length() >0;
        //System.out.println("digitCaseControl = " + digitCaseControl);
        if (!digitCaseControl){
            System.out.println("Sifre en az bir reqem yazilmalidir");
        }

        boolean isValid = lengtControl && spaceControl && upperCaseControl && lowerCaseControl && digitCaseControl;
        if (isValid) {
            System.out.println("Sifre kecerlidir");
        } else {
            System.out.println("Sifre kecersizdir");
        }





    }
}
