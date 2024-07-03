package binaryTree_TEST.BST_TEST;
import com.mruruc.binaryTree.BST_Tree.BST_Implementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BST_ImplementationTest {
    private BST_Implementation bst;

    @BeforeEach
    public void setUp() {
        bst = new BST_Implementation();
    }

    @Test
    public void testInsertRecursive() {
        bst.insertRecursive(5);
        bst.insertRecursive(3);
        bst.insertRecursive(7);
        assertEquals(1, bst.height());
    }

    @Test
    public void testInsertIterative() {
        assertTrue(bst.insertIterative(5));
        assertTrue(bst.insertIterative(3));
        assertTrue(bst.insertIterative(7));
        assertEquals(3, bst.getSize());
    }

    @Test
    public void testSearchRecursively() {
        bst.insertRecursive(5);
        bst.insertRecursive(3);
        bst.insertRecursive(7);
        assertTrue(bst.searchRecursively(3));
        assertFalse(bst.searchRecursively(8));
    }

    @Test
    public void testSearchIteratively() {
        bst.insertIterative(5);
        bst.insertIterative(3);
        bst.insertIterative(7);
        assertTrue(bst.searchIteratively(7));
        assertFalse(bst.searchIteratively(1));
    }

    @Test
    public void testHeight() {
        bst.insertRecursive(5);
        bst.insertRecursive(3);
        bst.insertRecursive(7);
        assertEquals(1, bst.height());
    }
}