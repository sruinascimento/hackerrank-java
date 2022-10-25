package daily.challenges.day16;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge016JavaAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
//        if (firstWord.length() != secondWord.length() || firstWord.length() < 1 || firstWord.length() > 51) {
//            throw new IllegalArgumentException("Invalids arguments");
//        }

        char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
