package daily.challenges.day14;

import java.util.ArrayList;
import java.util.List;

public class Challenge014JavaSubstringComparison {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava" ,3));
//        janelamento("welcometojava" ,3);
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

    //Para testar o janelamento
//    public static void janelamento(String s, int k) {
//        System.out.println(s.substring(0, k));
//        for (int i = 1; i <= s.length() - k; i++) {
//            System.out.println(s.substring(i, i+k));
//        }
//    }
}
