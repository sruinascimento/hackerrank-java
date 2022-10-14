package daily.challenges.day2;

import java.util.Scanner;

public class Challenge003IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N >= 1 && N <= 100) {
            boolean odd = N % 2 == 0;

            if (odd) {
                System.out.println("Weird");
            } else {
                if ( (N >= 2 && N <= 5) || (N > 20) ) System.out.println("Not Weird");
                if ( N >= 6 && N <= 20) System.out.println("Weird");
            }

        } else {
            System.out.println("Number N out of range");
        }
    }
}
