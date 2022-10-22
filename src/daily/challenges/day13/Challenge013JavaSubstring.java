package daily.challenges.day13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Challenge013JavaSubstring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S = input.next();
        int start = input.nextInt();
        int end = input.nextInt();

        boolean lengthAllowed = S.length() >= 1 && S.length() <= 100;
        boolean indexAllowed = start >= 0 && start < end && end <= S.length();
        boolean patternStringAllowed = Pattern.compile("^[a-zA-Z]+$").matcher(S).find();

        if (lengthAllowed && indexAllowed && patternStringAllowed){
            System.out.printf("%s", S.substring(start, end));
        } else {
            System.out.println("Invalid input!");
        }
    }
}
