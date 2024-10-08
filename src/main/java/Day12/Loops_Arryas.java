package Day12;

public class Loops_Arryas {
    public static void main(String[] args) {

     int k = 312;
     String original = String.valueOf(k);
     String reversed = "";

     int index = original.length()-1;

     while (index >= 0){
         reversed = reversed + original.charAt(index);
         index--;
     }
        System.out.println(reversed);

     if (original.equals(reversed)) {
         System.out.println("Palindromdur");
     } else {
         System.out.println("Palindrom deyildir");
     }






    }
}
