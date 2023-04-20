import com.mruruc.SearchingInList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchingInList_Test {
    private SearchingInList<Integer> list;

    @BeforeEach
    public void setUp(){
        list=new SearchingInList<>();
    }

    @Test
    public void test_LinearSearch(){
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(0);
        assertTrue(list.linearSearch(3));
        assertFalse(list.linearSearch(9));

    }
    @Test
    public void test_BinarySearch(){
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(0);
        assertTrue(list.linearSearch(3));
        assertFalse(list.linearSearch(9));

    }
}
