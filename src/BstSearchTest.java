import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void testTraverseBSTHasTarget(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        root.left = new BinaryTreeNode<>(28);
        root.right = new BinaryTreeNode<>(72);
        root.left.left = new BinaryTreeNode<>(10);
        root.left.right = new BinaryTreeNode<>(48);
        root.right.left = new BinaryTreeNode<>(60);
        root.right.right = new BinaryTreeNode<>(84);

        assertTrue(BstSearch.contains(root, 28));
        assertTrue(BstSearch.contains(root, 10));
        assertTrue(BstSearch.contains(root, 48));
    }

    @Test
    void testTraverseBSTHasWrongTarget(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        root.left = new BinaryTreeNode<>(28);
        root.right = new BinaryTreeNode<>(72);
        root.left.left = new BinaryTreeNode<>(10);
        root.left.right = new BinaryTreeNode<>(48);
        root.right.left = new BinaryTreeNode<>(60);
        root.right.right = new BinaryTreeNode<>(84);

        assertFalse(BstSearch.contains(root, 11));
        assertFalse(BstSearch.contains(root, 39));
        assertFalse(BstSearch.contains(root, 30));
    }
}
