package daily.challenges.day4;

import java.util.Scanner;

public class Chllenge004JavaOutputFormating {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = 3;
            System.out.println("================================");
            while (count-- > 0) {
                String str = scanner.next();
                int x = scanner.nextInt();

                if ((str.length() < 11) && (x >= 0 && x <= 999)) {
                    System.out.printf("%-15s%03d%n", str, x);
                }
            }
            System.out.println("================================");
    }
}
