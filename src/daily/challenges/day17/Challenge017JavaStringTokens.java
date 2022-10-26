package daily.challenges.day17;

import java.util.Scanner;

public class Challenge017JavaStringTokens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().trim();

        if (word.length() >= 1 && !word.equals(" ")) {
            String[] tokens = word.split("[^\\p{Alpha}]+");
            System.out.printf("%d%n", tokens.length);
            if (tokens.length > 0) {
                for (String token : tokens) {
                    System.out.printf("%s%n", token);
                }
            }
        } else {
            System.out.printf("%d%n", 0);
        }
    }
}
