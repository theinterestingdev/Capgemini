import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class DividerTest {
    private Divider divider;
    
    @BeforeEach
    void setUp() {
        divider = new Divider();
    }
    
    @Test
    void testNormalDivision() {
        assertEquals(2, divider.divide(10, 5));
        assertEquals(3, divider.divide(9, 3));
        assertEquals(0, divider.divide(0, 5));
        assertEquals(-2, divider.divide(-10, 5));
    }
    
    @Test
    void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, 
            () -> divider.divide(10, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
    
    @Test
    void testDivisionByZeroWithNegativeNumbers() {
        assertThrows(ArithmeticException.class, () -> divider.divide(-10, 0));
        assertThrows(ArithmeticException.class, () -> divider.divide(0, 0));
    }
}
