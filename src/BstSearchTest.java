import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void containsRoot() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);

        assertTrue(BstSearch.contains(root, 8));
    }

    @Test
    void containsLeft() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        root.left = new BinaryTreeNode<>(3);

        assertTrue(BstSearch.contains(root, 3));
    }
}
