import com.mruruc.SinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedList_Test {
    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void testAddFirst() {
        list.addFirst(1);
        assertEquals(1, list.counter);
        assertEquals(Integer.valueOf(1), list.head.data);
        assertEquals(list.head, list.tail);

        list.addFirst(2);
        assertEquals(2, list.counter);
        assertEquals(Integer.valueOf(2), list.head.data);
        assertEquals(Integer.valueOf(1), list.tail.data);
    }

    @Test
    void testAddAfter() {
        list.addFirst(1);
        list.addAfter(1, 2);
        assertEquals(2, list.counter);
        assertEquals(Integer.valueOf(2), list.tail.data);

        list.addAfter(1, 3);
        assertEquals(3, list.counter);
        assertEquals(Integer.valueOf(3), list.head.next.data);
    }


    @Test
    void testRemoveFirst() {
        list.addFirst(1);
        list.addFirst(2);
        list.removeFirst();
        assertEquals(1, list.counter);
        assertEquals(Integer.valueOf(1), list.head.data);
        assertEquals(list.head, list.tail);

        list.removeFirst();
        assertEquals(0, list.counter);
        assertNull(list.head);
        assertNull(list.tail);
    }

    @Test
    void testRemoveLast() {
        list.addFirst(1);
        list.addFirst(2);
        list.removeLast();
        assertEquals(1, list.counter);
        assertEquals(Integer.valueOf(2), list.head.data);
        assertEquals(list.head, list.tail);

        list.removeLast();
        assertEquals(0, list.counter);
        assertNull(list.head);
        assertNull(list.tail);
    }

    @Test
    void testAddLast() {
        list.addLast(1);
        assertEquals(1, list.counter);
        assertEquals(Integer.valueOf(1), list.head.data);
        assertEquals(list.head, list.tail);

        list.addLast(2);
        assertEquals(2, list.counter);
        assertEquals(Integer.valueOf(1), list.head.data);
        assertEquals(Integer.valueOf(2), list.tail.data);
    }

    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.addFirst(1);
        assertFalse(list.isEmpty());
    }
}

