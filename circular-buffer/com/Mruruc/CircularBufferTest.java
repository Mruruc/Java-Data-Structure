package com.Mruruc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    @Test
    void testDefaultConstructor() {
        CircularBuffer buffer = new CircularBuffer();
        assertEquals(0, buffer.size());
    }

    @Test
    void testCustomSizeConstructor() {
        CircularBuffer buffer = new CircularBuffer(5);
        assertEquals(0, buffer.size());
    }

    @Test
    void testPush1() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        assertEquals(3, buffer.size());
    }

    @Test
    void testPush2() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> buffer.push(4));
    }

    @Test
    void testPop1() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.push(1);
        buffer.push(2);
        buffer.pop();
        assertEquals(1, buffer.size());
    }

    @Test
    void testPop2() {
        CircularBuffer buffer = new CircularBuffer(3);
        assertThrows(ArrayStoreException.class, () -> buffer.pop());
    }

    @Test
    void testFuncationality() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.push(1);
        buffer.push(2);
        buffer.push(3);
        buffer.pop();
        buffer.push(4);
        assertEquals(3, buffer.size());
    }
}