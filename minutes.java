/**
 *  Name: Samuel Adams Adjin
 */

public class Minutes {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {

            System.out.println("Invalid Value");

        } else {

            long hours = minutes / 60;

            long days = hours / 24;

            long years = days / 365;

            long daysLeft = days % 365;


            System.out.println(minutes + " min = " + years + " y and " + daysLeft + " d");

        }

    }
}
