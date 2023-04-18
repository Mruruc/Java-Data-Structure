package Stack_With_Array_TEST;

import com.mruruc.Stack_With_Array.DynamicStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicStackTest {
    private DynamicStack ds;

    @BeforeEach
    void setUp() {
        ds = new DynamicStack(2);
    }

    @Test
    void testPushAndPop() {
        ds.push(1);
        ds.push(2);
        assertEquals(2, ds.size());

        ds.push(3); // This should trigger the doubleSize() method
        assertEquals(3, ds.size());

        assertEquals(3, ds.pop());
        assertEquals(2, ds.pop());
        assertEquals(1, ds.pop());
    }

    @Test
    void testEmptyStack() {
        assertTrue(ds.isEmpty());
        assertThrows(IllegalStateException.class, ds::pop);
    }

    @Test
    void testFullStack() {
        ds.push(1);
        ds.push(2);
        assertTrue(ds.isFull());
    // This should trigger the doubleSize() method and the stack is no longer full
        ds.push(3);
        assertFalse(ds.isFull());
    }
}
