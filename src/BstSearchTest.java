import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test
    public void testFound() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);

        assertTrue(BstSearch.contains(root, 5));
    }

    @Test
    public void testNotFound() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

        assertFalse(BstSearch.contains(root, 20));
    }
}
