package daily.challenges.day10;

import java.time.LocalDate;

public class Challenge010JavaDateAndTime {

    public static void main(String[] args) {
        int day = 20;
        int month = 9;
        int year = 2022;

        System.out.println(findDay(month, day, year));

    }

    public static String findDay(int month, int day, int year) {
        if (year > 2000 && year < 3000) {
            return String.valueOf(LocalDate.of(year, month, day).getDayOfWeek());
        }

        return "Invalid Year!";
    }
}
