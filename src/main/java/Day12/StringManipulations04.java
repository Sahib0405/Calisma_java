package Day12;

public class StringManipulations04 {
    public static void main(String[] args) {

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice);

        //---------------------------------------

        String name = "   ali cAN  ";

            char first = name.trim().toUpperCase().charAt(0);
            System.out.println(first);

            char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
            System.out.println(last);

            System.out.println("" + first + last);






    }
}
