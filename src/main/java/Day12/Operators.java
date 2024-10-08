package Day12;

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 10;
        System.out.println("Sum" + (a + b));
        System.out.println("Diff" + (a - b));
        System.out.println("Multiplic" + (a * b));
        System.out.println("Division" + (a / b));
        System.out.println("Module division" + (a % b));

        //-------------------------
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println(a == b);

        boolean result = a != b;
        System.out.println(result);
        System.out.println("-----------------");
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        boolean b1 = 10>20;
        System.out.println(b1);
        boolean b2 = 20>10;
        System.out.println(b2);

        System.out.println(b1 && b2);
        System.out.println(b1 || b2);

        System.out.println((10<20 && 20>10));



    }
}
