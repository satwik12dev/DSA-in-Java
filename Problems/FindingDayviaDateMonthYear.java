package Problems;

import java.util.Calendar;

public class FindingDayviaDateMonthYear {
    //You are given a date. You just need to write the method,which returns the day on that date.
    // Example month = 08, date = 05, Year = 2025 it should return TUESDAY

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day); // month-1 is important

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        String[] days = {
                "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday"
        };

        return days[dayOfWeek-1].toUpperCase();
    }

    public static void main(String[] args) {
        String res = findDay(8,05,2025);
        System.out.println(res);
    }
}
