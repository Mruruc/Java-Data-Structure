package Queue_With_Array_Test;

import com.mruruc.Queue_With_Array.CircularQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularQueueTEST {
    public void testIsEmpty() {
        CircularQueue queue = new CircularQueue(3);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEnqueue() {
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue("A");
        queue.enqueue("B");
        assertEquals(2, queue.size());
    }

    @Test
    public void testDeQueue() {
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue("A");
        queue.enqueue("B");

        assertEquals("A", queue.deQueue());
        assertFalse(queue.isEmpty());
    }
    @Test
    public void test_enqueue_dequeue(){
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("c");
        queue.deQueue();
        queue.enqueue("f");
        assertEquals("B",queue.peek());
        assertEquals(3,queue.size());


    }

    @Test
    public void testIsFull() {
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assertTrue(queue.isFull());

        assertThrows(IndexOutOfBoundsException.class, () -> queue.enqueue("D"));
    }

    @Test
    public void testDeQueueOnEmptyQueue() {
        CircularQueue queue = new CircularQueue(3);
        assertThrows(IllegalStateException.class, () -> queue.deQueue());
    }

    @Test
    public void testDefaultSize() {
        CircularQueue queue = new CircularQueue();
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPrint() {
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        queue.print();
    }

}

