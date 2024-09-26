package Day12;

public class ifstat04 {
    public static void main(String[] args) {

        String pwd = "a ";
        boolean first =pwd.isEmpty();
        System.out.println(first);

        boolean second =pwd.isBlank();
        System.out.println(second);

        boolean third = pwd.trim().equals(pwd);
        System.out.println(third);

        if (first){
            System.out.println("Parola hecbir sey yazmadan gecilmez");
        }
        if (second){
            System.out.println("Parola bos burakilmamali ve bosluk harici karakterlerde bulunmalidir");
        }
        if (third){
            System.out.println("Parolun basinda ve sonunda bosluq bulunmamali");
        }







    }
}
