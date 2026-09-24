import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test
    void testContains_assertTrue() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(63);
        root.right.left = new BinaryTreeNode<Integer>(21);
        int target = 21;
        assertTrue(BstSearch.contains(root, target));
    }

    @Test
    void testContains_assertFalse() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(20);
        root.left = new BinaryTreeNode<>(15);
        root.left.left = new BinaryTreeNode<>(-7);
        root.left.right = new BinaryTreeNode<>(19);
        int target = -2;
        assertFalse(BstSearch.contains(root, target));
    }

    @Test
    void testContains_assertTrueRootIsTarget() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        int target = 5;
        assertTrue(BstSearch.contains(root, target));
    }

    @Test
    void testContains_assertFalseRootIsNull() {
        BinaryTreeNode<Integer> root = null;
        int target = 5;
        assertFalse(BstSearch.contains(root, target));
    }

    @Test
    void testContains_throwNullPointerException() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        assertThrows(NullPointerException.class, () -> BstSearch.contains(root, null));
    }
}
