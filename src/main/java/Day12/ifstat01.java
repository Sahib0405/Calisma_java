package Day12;

public class ifstat01 {
    public static void main(String[] args) {

        //1ci yol static code hard coding
        String a = "abfg.fgc@gmail.com";
        System.out.println(a.substring(4,9));

        //2ci yol Dinamik
        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1);

        int star = a.indexOf("@")+1;
        int end = a.indexOf(".");
        String companyName = a.substring(star, end);
        System.out.println(companyName);













    }
}
