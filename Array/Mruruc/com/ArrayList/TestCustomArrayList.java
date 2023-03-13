package ArrayList;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TestCustomArrayList {
    @Test
    public void testAdd() {
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
        assertEquals(3, list.size());
        assertEquals(5, list.getValue(0));
        assertEquals(10, list.getValue(1));
        assertEquals(15, list.getValue(2));
    }

    @Test
    public void testgetIndex(){
        CustomArrayList list = new CustomArrayList();
        list.add(0);
        list.add(-5);
        list.add(15);
        assertEquals(1,list.getIndex(-5));
    }
    @Test
    public void testIsEmpty(){
        CustomArrayList list = new CustomArrayList();
        assertTrue(list.isEmpty());
        list.add(0);
        list.add(-5);
        list.add(15);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testResize(){
        CustomArrayList list = new CustomArrayList();
        //initial capacity was 10:
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        assertEquals(15, list.size());
        for (int i = 0; i < 15; i++) {
            assertEquals(i, list.getValue(i));
        }
    }

    @Test
    public void testSet(){
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(3);
        list.add(6);
        list.set(1,200);
        assertEquals(200,list.getValue(1));
    }

    @Test
    public void testRemoveAt(){
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(11);
        list.removeAt(2);
        assertEquals(3,list.size());
        //[5,3,11]
        assertEquals(11,list.getValue(2));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAtOutOfBounds() {
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.removeAt(1);
    }

    @Test
    public void testZeroValue() {
        CustomArrayList list = new CustomArrayList();
        list.add(0);
        assertEquals(1, list.size());
        assertEquals(0, list.getValue(0));
    }
    @Test
    public void testPrint() {
        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
        assertEquals("5 10 15", getOutput(list));
    }

    private String getOutput(CustomArrayList list) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        list.print();
        return outContent.toString().trim();
    }


}
