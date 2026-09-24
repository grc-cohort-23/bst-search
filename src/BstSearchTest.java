import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void containsRoot() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);

        assertTrue(BstSearch.contains(root, 8));
    }
}
