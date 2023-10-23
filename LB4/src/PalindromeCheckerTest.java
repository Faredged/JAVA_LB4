import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeWord() {
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithPalindromePhrase() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }
}