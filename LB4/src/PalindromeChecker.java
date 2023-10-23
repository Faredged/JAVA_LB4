public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        // Remove spaces and convert to lowercase
        word = word.replaceAll("\\s", "").toLowerCase();

        // Compare with the reversed word
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}

