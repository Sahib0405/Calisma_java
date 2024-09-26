package Day12;

public class ifstat03 {
    public static void main(String[] args) {

        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0,15).replaceAll("[0-9]", "*");
        System.out.println(first);

        String last = cardNum.substring(15);
        System.out.println(last);

        String result1 = first +last;
        System.out.println(result1);

        String result2 = first.concat(last);
        System.out.println(result2);




















    }
}
