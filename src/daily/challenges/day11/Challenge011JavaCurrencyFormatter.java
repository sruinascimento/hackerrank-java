package daily.challenges.day11;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Challenge011JavaCurrencyFormatter {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        if (payment>= 0 && payment <= Math.pow(10, 9)) {

            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
            String china= NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);

        } else {
            System.out.println("Invalid Payment");
        }
    }
}
