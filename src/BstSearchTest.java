import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test
    public void testFound() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(20);
        root.left = new BinaryTreeNode<>(8);
        root.right = new BinaryTreeNode<>(30);

        assertTrue(BstSearch.contains(root, 8));
    }

    @Test
    public void testNotFound() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(20);

        assertFalse(BstSearch.contains(root, 50));
    }
}
