
import com.mruruc.CircularLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularLinkedList_Test {
    private CircularLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new CircularLinkedList<>();
    }

    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void testAddFirst() {
        list.addFirst(1);
        assertEquals(1, list.head.data);
        assertEquals(1, list.tail.data);
    }

    @Test
    void testAddLast() {
        list.addFirst(1);
        list.addLast(2);
        assertEquals(1, list.head.data);
        assertEquals(2, list.tail.data);
    }

    @Test
    void testGetSize() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.getSize());
    }

    @Test
    void testRemoveFirst() {
        list.addFirst(1);
        list.addFirst(2);
        list.removeFirst();
        assertEquals(1, list.head.data);
    }

    @Test
    void testRemoveFirstSingleElement() {
        list.addFirst(1);
        list.removeFirst();
        assertNull(list.head);
        assertNull(list.tail);
    }

    @Test
    void testRemoveLast() {
        list.addFirst(1);
        list.addFirst(2);
        list.removeLast();
        assertEquals(2, list.head.data);
    }

    @Test
    void testRemoveLastSingleElement() {
        list.addFirst(1);
        list.removeLast();
        assertNull(list.head);
        assertNull(list.tail);
    }
}
