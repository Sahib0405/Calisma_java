package Day12;

public class Forloops02 {
    public static void main(String[] args) {


        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a'){

                break;
            }
            System.out.print(ch);
        }
        System.out.println("-------------------");
        //----------------------------------------
        String s1 = "Pwd12?Ab";
        for (int i = 0; i < s.length(); i++) {

            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                continue; //geri kalan kodlari yurutme, artirma azaltmaya git

            } else {
                System.out.print(ch);
            }

        }
        System.out.println("-----------------");
        //-----------------------------

        String t = "Java";
        String reverse = "";

        for (int i = t.length()-1; i >=0 ; i--) {
            reverse = reverse + t.charAt(i);
            System.out.println("Loop ici : " + reverse);
        }
        System.out.println(reverse);






    }
}
