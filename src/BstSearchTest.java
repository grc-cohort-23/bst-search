import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void smallTreeTest1(){
        BinaryTreeNode root = new BinaryTreeNode<Integer>(5);
        root.left = new BinaryTreeNode<Integer>(3);
        root.right = new BinaryTreeNode<Integer>(8);
        root.left.left = new BinaryTreeNode<Integer>(1);
        root.left.right = new BinaryTreeNode<Integer>(4);
        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(10);
        assertTrue(BstSearch.contains(root, 6));
    }
    @Test
    void smallTreeTest2(){
        BinaryTreeNode root = new BinaryTreeNode<Integer>(5);
        root.left = new BinaryTreeNode<Integer>(3);
        root.right = new BinaryTreeNode<Integer>(8);
        root.left.left = new BinaryTreeNode<Integer>(1);
        root.left.right = new BinaryTreeNode<Integer>(4);
        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(10);
        assertFalse(BstSearch.contains(root, 7));
    }

    @Test
    void smallTreeTest3(){
        BinaryTreeNode root = new BinaryTreeNode<Integer>(5);
        root.left = new BinaryTreeNode<Integer>(3);
        root.right = new BinaryTreeNode<Integer>(8);
        root.left.left = new BinaryTreeNode<Integer>(1);
        root.left.right = new BinaryTreeNode<Integer>(4);
        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(10);
        assertTrue(BstSearch.contains(root, 4));
    }

    @Test
    void smallTreeTest4(){
        BinaryTreeNode root = new BinaryTreeNode<Integer>(5);
        root.left = new BinaryTreeNode<Integer>(3);
        root.right = new BinaryTreeNode<Integer>(8);
        root.left.left = new BinaryTreeNode<Integer>(1);
        root.left.right = new BinaryTreeNode<Integer>(4);
        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(10);
        assertFalse(BstSearch.contains(root, -1));
    }
}
