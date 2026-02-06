import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class StringUtilsTest {
    private StringUtils stringUtils;
    
    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }
    
    @Test
    void testReverse() {
        assertEquals("olleH", stringUtils.reverse("Hello"));
        assertEquals("abcba", stringUtils.reverse("abcba"));
        assertEquals("", stringUtils.reverse(""));
        assertNull(stringUtils.reverse(null));
    }
    
    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(stringUtils.isPalindrome("a"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome("java"));
        assertFalse(stringUtils.isPalindrome(null));
    }
    
    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("WORLD"));
        assertEquals("JAVA", stringUtils.toUpperCase("Java"));
        assertEquals("", stringUtils.toUpperCase(""));
        assertNull(stringUtils.toUpperCase(null));
    }
}
