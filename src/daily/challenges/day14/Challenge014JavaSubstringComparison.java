package daily.challenges.day14;

import java.util.Scanner;

public class Challenge014JavaSubstringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int k = input.nextInt();

        // welcometojava 3

        System.out.println(getSmallestAndLargest(s ,k));
//        janelamento(s ,k);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String substring = s.substring(0, k);
        smallest = substring;
        largest = substring;

        for (int i = 1; i <= s.length() - k; i++) {
            substring = s.substring(i, i+k);

            if (smallest.compareTo(substring) > 0) smallest = substring;

            if (largest.compareTo(substring) < 0) largest = substring;
        }
        return smallest + "\n" + largest;

    }

//    Para testar o janelamento
    public static void janelamento(String s, int k) {
        System.out.println(s.substring(0, k));
        for (int i = 1; i <= s.length() - k; i++) {
            System.out.println(s.substring(i, i+k));
        }
    }
}
