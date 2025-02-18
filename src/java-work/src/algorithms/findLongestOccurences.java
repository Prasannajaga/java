package algorithms;

import java.util.Arrays;

public class findLongestOccurences {

    public static void main(String[] args) {
        String[] arr = {"flower", "flowerist", "fly"};

        String longestRepeatedSubstring = findLongestRepeatedSubstring(arr);
        System.out.println("Longest Repeated Substring: " + longestRepeatedSubstring);
    }

    public static String findLongestRepeatedSubstring(String[] arr) {
        // Step 1: Concatenate all strings with unique separator
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append("#"); // '#' ensures unique word boundaries
        }
        String fullString = sb.toString();
        System.err.println("full string " + fullString + fullString.length());
        // Step 2: Generate suffix array
        int n = fullString.length();
        String[] suffixes = new String[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = fullString.substring(i);
        }
        Arrays.sort(suffixes); // Sorting suffixes
        System.err.println("Suffices " + Arrays.toString(suffixes));

        // Step 3: Find Longest Common Prefix (LCP) in sorted suffixes
        String longest = "";
        for (int i = 0; i < n - 1; i++) {
            String lcp = longestCommonPrefix(suffixes[i], suffixes[i + 1]);
            if (lcp.length() > longest.length()) {
                longest = lcp;
            }
        }
        return longest;
    }

    // Helper function to find the Longest Common Prefix (LCP)
    private static String longestCommonPrefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, minLength);
    }
}
