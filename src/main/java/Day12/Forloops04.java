package Day12;

public class Forloops04 {
    public static void main(String[] args) {


        //--------------while
         /*        baslangic degeri
        while ( loop calisma kurali) {
            calisacak kodlar
            artirma/azaltma
        }*/

        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }

        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz(12 dahil).
        //Example 2: Write the even integers from 23 to 12 to the console (including 12)

        int k = 23;

        while (k > 11) {

            if (k % 2 == 0) {
                System.out.println(k);
            }
            k--;

        }




    }
}