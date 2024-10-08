package Day12;

public class DoWhileLoops01 {
    public static void main(String[] args) {

        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 2);

        //------------------------

        int k = 1;
        while (k < 1) {
            System.out.println("Ben while Loop-um");
            k++;
        }
        //-------------------------
        int m = 1;
        do {
            System.out.println("Ben do while Loop-um");
            m++;
        } while (m > 1);


    }
}
