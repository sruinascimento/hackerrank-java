package daily.challenges.day15;

import java.util.Scanner;

public class Challenge015JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(isPalindrome(word)? "Yes": "No");
    }

    public static boolean isPalindrome(String word) {
        if (word.length() > 50 | !word.equals(word.toLowerCase()) ) {
            throw new IllegalArgumentException("Invalid word!");
        }
        int i = 0;
        int j = word.length() - 1;

        while (i < word.length()) {
//            System.out.printf("%s%n", word.charAt(i));
            if (!(word.charAt(i) == word.charAt(j))) return false;
            j--;
            i++;
        }
        return true;
    }
}
