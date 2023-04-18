package Queue_With_Array_Test;

import com.mruruc.Queue_With_Array.DynamicQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicQueueTEST {
    private DynamicQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new DynamicQueue<>();
    }

    @Test
    void enqueueDequeueAndResize() {
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        assertEquals(20, queue.size());
        for (int i = 0; i < 20; i++) {
            assertEquals(i, queue.deQueue());
        }
        assertEquals(0, queue.size());
    }

    @Test
    void peekAndEmpty() {
        assertTrue(queue.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        assertFalse(queue.isEmpty());
        assertEquals(0, queue.peek());
        assertEquals(10, queue.size());
    }

    @Test
    void enqueueAndFull() {
        assertFalse(queue.isFull());
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        assertTrue(queue.isFull());
    }

    @Test
    void exceptionHandling() {
        assertThrows(IllegalStateException.class, queue::deQueue);
        assertThrows(IllegalStateException.class, queue::print);
    }
}

