package Day12;

import java.util.Scanner;

public class ifelseif09 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter day name");
        String dayName = input.next();

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");

        boolean isWeekEnd = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        if (isWeekDay) {
            System.out.println("Weekday");

        } else if (isWeekEnd) {
            System.out.println("Weekend");
        } else {
            System.out.println("Enter a valid day name");
        }






    }
}
