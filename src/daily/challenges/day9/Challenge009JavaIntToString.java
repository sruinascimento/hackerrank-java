package daily.challenges.day9;

import java.util.Scanner;

public class Challenge009JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            String s = "" + n;

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
