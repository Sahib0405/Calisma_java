package Day12;

public class Whileloops02 {
    public static void main(String[] args) {



        int year = 1600;


        String result = (year % 100 == 0) ? ((year % 400 == 0) ? ("Leap Year") : ("Leap year degil")) :
                ((year % 4==0) ? ("Leap Year") : ("Leap Year degil"));

        System.out.println(result);

        String s = "Java is easy";
        int slength = s.length();
        System.out.println(slength);

        char firstChar=s.charAt(0);
        System.out.println(firstChar);

        char lastChar = s.charAt(11);
        System.out.println(lastChar);

        char lastChar2 = s.charAt(s.length()-1);
        System.out.println(lastChar2);

        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        String sub2 = s.substring(8,12);
        System.out.println(sub2);

        boolean isExist = s.contains("easy");
        System.out.println(isExist);

        boolean sub4 = s.startsWith("j");
                System.out.println(sub4);

        boolean sub5 = s.endsWith("easy");
        System.out.println(sub5);












    }
}
