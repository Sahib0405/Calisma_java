package Day12;

public class Stringregex {
    public static void main(String[] args) {

        String m = "Ali Can Kahraman";

        String s = "Learn Java earn 1234 monet";

        String s2 = s.replaceAll("[0-9]", "*");
        System.out.println(s2);

       int num = s.replaceAll("[^A-Z]" , "").length();
        System.out.println(num);









    }
}
