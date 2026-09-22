import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void testTrueInt() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(2, new BinaryTreeNode<Integer>(1), new BinaryTreeNode<Integer>(3));
        assertEquals(true, BstSearch.contains(root, 3));
    }
}
