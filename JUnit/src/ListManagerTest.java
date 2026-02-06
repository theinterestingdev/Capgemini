import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {
    private ListManager listManager;
    private List<Integer> testList;
    
    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        testList = new ArrayList<>();
    }
    
    @Test
    void testAddElement() {
        listManager.addElement(testList, 5);
        assertEquals(1, testList.size());
        assertTrue(testList.contains(5));
        
        listManager.addElement(testList, 10);
        assertEquals(2, testList.size());
        assertTrue(testList.contains(10));
    }
    
    @Test
    void testRemoveElement() {
        testList.add(5);
        testList.add(10);
        testList.add(15);
        
        assertTrue(listManager.removeElement(testList, 10));
        assertEquals(2, testList.size());
        assertFalse(testList.contains(10));
        
        assertFalse(listManager.removeElement(testList, 100));
        assertEquals(2, testList.size());
    }
    
    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(testList));
        
        listManager.addElement(testList, 5);
        assertEquals(1, listManager.getSize(testList));
        
        listManager.addElement(testList, 10);
        assertEquals(2, listManager.getSize(testList));
        
        listManager.removeElement(testList, 5);
        assertEquals(1, listManager.getSize(testList));
    }
    
    @Test
    void testNullList() {
        listManager.addElement(null, 5);
        assertFalse(listManager.removeElement(null, 5));
        assertEquals(0, listManager.getSize(null));
    }
}
