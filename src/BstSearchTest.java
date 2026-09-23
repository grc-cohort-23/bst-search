import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test 
    public void testContains15() {
        assertTrue(BstSearch.contains(testTree(), 15));
    }
    private BinaryTreeNode<Integer> testTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(23);
        root.left = new BinaryTreeNode<Integer>(13);
        root.left.left = new BinaryTreeNode<Integer>(7);
        root.left.right = new BinaryTreeNode<Integer>(15);

        root.right = new BinaryTreeNode<Integer>(29);
        root.right.left = new BinaryTreeNode<Integer>(25);
        root.right.right = new BinaryTreeNode<Integer>(34);

        return root;
}
}



