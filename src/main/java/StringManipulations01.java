public class StringManipulations01 {
    public static void main(String[] args) {

        String s = "Java is easy";
        int slength = s.length();
        System.out.println(slength);
        System.out.println("-------------");

        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        char lastChar = s.charAt(11);
        System.out.println(lastChar);

        char lastChar2 = s.charAt(s.length()-1);
        System.out.println(lastChar2);

        String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        String sub3 = s.substring(8, 12);
        System.out.println(sub3);

        String sub4 = s.substring(0);
        System.out.println(sub4);

        //--------------------
        boolean isExist = s.contains("easy");
        System.out.println(isExist);

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);

        String d ="Learn Java earn money";
        String d1 = d.replace("money" , "manat");
        System.out.println(d1);

        String d2 = d.replace("e" , " ");
        System.out.println(d2);








    }
}
