package binaryTree_TEST;

import com.mruruc.binaryTree.DynamicBinaryTree.DynamicBinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class binaryTree_Test {
    private DynamicBinaryTree<Character> root;
    @BeforeEach
    void setUp(){
        this.root=new DynamicBinaryTree<>('A');
    }



    @Test
    void test_size_0(){
        assertEquals(root.getSize(),1);
    }
    @Test
    void test_print() throws IOException {
        root.add('B');
        root.add('C');
        root.add('E');
        // Redirect the output of the print method to a string
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        root.print();

        // Compare the output string with the expected output
        String expectedOutput = "A B C E ";
        String actualOutput = outContent.toString();
        assertEquals(expectedOutput, actualOutput);
       outContent.close();
    }

}
