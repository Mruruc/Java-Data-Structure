package Queue_With_Array_Test;

import com.mruruc.Queue_With_Array.SimpleQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleQueueTEST {
    private SimpleQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new SimpleQueue();
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(10);
        assertEquals(1, queue.getSize());
        assertEquals(10, queue.peek());
    }

    @Test
    public void testDequeue() {
        queue.enqueue(10);
        queue.enqueue(20);
        int dequeuedValue = queue.dequeue();
        assertEquals(10, dequeuedValue);
        assertEquals(1, queue.getSize());
        assertEquals(20, queue.peek());
    }

    @Test
    public void testPeek() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.peek());
        assertEquals(2, queue.getSize());
    }

    @Test
    public void testGetSize() {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(3, queue.getSize());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(10);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        SimpleQueue customQueue = new SimpleQueue(2);
        assertFalse(customQueue.isFull());
        customQueue.enqueue(10);
        customQueue.enqueue(20);
        assertTrue(customQueue.isFull());
    }

    @Test
    public void testEnqueueThrowsExceptionWhenFull() {
        SimpleQueue customQueue = new SimpleQueue(2);
        customQueue.enqueue(10);
        customQueue.enqueue(20);
        assertThrows(IndexOutOfBoundsException.class, () -> customQueue.enqueue(30));
    }

    @Test
    public void testDequeueThrowsExceptionWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> queue.dequeue());
    }
}
