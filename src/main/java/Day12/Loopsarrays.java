package Day12;

public class Loopsarrays {
    public static void main(String[] args) {

        int k = 313;

        String original = String.valueOf(k); // "312"
        String reversed = ""; //ters cevrilmis olani bunun icinde saklayacagiz

        int index = original.length() - 1; //son index'i elde ettik

        while (index >= 0) {
            reversed = reversed + original.charAt(index);
            index--;
        }
        System.out.println(reversed); //"213"

        if (original.equals(reversed)) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom degildir");
        }









    }

}
