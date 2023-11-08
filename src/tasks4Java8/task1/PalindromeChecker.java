package tasks4Java8.task1;

import java.util.stream.IntStream;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeLambda(String pal) {
        pal = pal.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String finalPal = pal;
        return IntStream.range(0, pal.length() / 2)
                .allMatch(i -> finalPal.charAt(i) == finalPal.charAt(finalPal.length() - i - 1));
    }
    
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        boolean isPalin = isPalindrome(input);
        boolean isPalind = isPalindromeLambda(input);
        System.out.println("Is Palindrome: " + isPalin);
        System.out.println("Is Palindrome: " + isPalind);
    }
}
