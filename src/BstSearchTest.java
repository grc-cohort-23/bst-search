import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    private BinaryTreeNode<Integer> root;
    
    @BeforeEach
    void setUp() {
        root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(15);
        root.left.left = new BinaryTreeNode<>(2);
        root.left.right = new BinaryTreeNode<>(7);
        root.right.right = new BinaryTreeNode<>(20);
    }

    @Test
    void testContainsRoot() {
        assertTrue(BstSearch.contains(root, 10));
    }

    @Test
    void testContainsLeftChild() {
        assertTrue(BstSearch.contains(root, 5));
        assertTrue(BstSearch.contains(root, 2));
    }

    @Test
    void testContainsRightChild() {
        assertTrue(BstSearch.contains(root, 15));
        assertTrue(BstSearch.contains(root, 20));
    }
}
