package Stack_With_Array_TEST;

import com.mruruc.Stack_With_Array.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(5);
    }

    @Test
    void pushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void isFull() {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    @Test
    void size() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }

    @Test
    void pushWhenFull() {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        assertThrows(IndexOutOfBoundsException.class, () -> stack.push(5));
    }

    @Test
    void popWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }
}
