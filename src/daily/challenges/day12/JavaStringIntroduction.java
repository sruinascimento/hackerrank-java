package daily.challenges.day12;

import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        String aCapitalized = A.substring(0,1).toUpperCase() + A.substring(1, A.length());
        String bCapitalized = B.substring(0,1).toUpperCase() + B.substring(1, B.length());
        System.out.printf("%d%n", (A.length() + B.length()));
        System.out.printf("%s%n", A.compareTo(B) > 0? "Yes": "No");
        System.out.printf("%s %s",aCapitalized, bCapitalized);
    }
}
