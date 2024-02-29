package best_practices;
import java.util.Scanner;
import static java.lang.Math.floor;

/*
This class has a super bloated method that does too many things at once. Refactor the describeYear method and
separate out the responsibilities into other methods to improve readability and maintainability.
 */
public class YearDescriber {

    static Scanner fromUser = new Scanner(System.in);

    private YearDescriber(){}; //static class


    public static String leapYear(int year) {
        if((year%4 == 0) || ((year%100 == 0) && !(year%400 == 0))) {
            return "a leap year,";
        } else {
            return "not a leap year,";
        }
    }

    public static String startDay(int year) {
        int startDay = (1 + (int)floor((2.6*11) -0.2) - (2*(year/100)) + ((year%100)-1) + (int)floor((double)((year%100)-1) / 4) + (int)floor((double)(year/100) / 4));

        startDay = (startDay % 7 + 7) % 7;

        // start day using array
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[startDay];

    }

    public static void describeYear() {
        System.out.println("What year would you like to learn about?");
        int year;

        while(true) {
            try {
                year = fromUser.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please just input a year in the format YYYY!");
            }
        }

        String printMessage = year + " was ";

        printMessage += leapYear(year);

        printMessage += " and started on a ";

        printMessage += startDay(year);

        printMessage += "!";

        System.out.println(printMessage);
    }
}
