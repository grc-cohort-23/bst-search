import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void BinaryTree_TestContains_True() {
        /*
         * Tree:
         *   4
         *  / \
         * 2   6
         */
        BinaryTreeNode<Integer> root =
            new BinaryTreeNode<>(4,
                new BinaryTreeNode<>(2),
                new BinaryTreeNode<>(6));
        assertTrue(BstSearch.contains(root, 2));
    }

    @Test
    void BinaryTree_TestContains_False() {
        /*
        * Tree:
        *          4
        *        /   \
        *       2     6
        *      / \   / \
        *   -10   3 5  10
        */
        BinaryTreeNode<Integer> root =
            new BinaryTreeNode<Integer>(4,
                new BinaryTreeNode<>(2,                    
                    new BinaryTreeNode<>(-10),
                    new BinaryTreeNode<>(3)),
                new BinaryTreeNode<>(6,
                    new BinaryTreeNode<>(5),
                    new BinaryTreeNode<>(10)));
        assertFalse(BstSearch.contains(root, 100));
    }

    @Test
    void BinaryTree_TestNullRoot_False() {
        BinaryTreeNode<Integer> root = null;
        assertFalse(BstSearch.contains(root, 100));
    }
}
