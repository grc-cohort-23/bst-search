import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
  @Test 
  void binarySearchTreeReturnFalseIfNull() {
    // BinaryTreeNode root = new BinaryTreeNode<Integer>(null);
    BinaryTreeNode<Integer> root = null;
    boolean result = BstSearch.contains(root, 5);
    assertFalse(result);
  }

    @Test 
  void binarySearchTreeReturnTrueIfRootIsEqualToTarget() {
    // BinaryTreeNode root = new BinaryTreeNode<Integer>(null);
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(50);
    boolean result = BstSearch.contains(root, 50);
    assertTrue(result);
  }

  @Test void binarySearchTreeReturnTrueIfTargetIsInTree() {
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(50);
    
    root.left = new BinaryTreeNode<Integer>(30);
    root.left.right= new BinaryTreeNode<Integer>(40);
    root.left.left = new BinaryTreeNode<Integer>(20);
    
    root.right = new BinaryTreeNode<Integer>(70);
    root.right.left = new BinaryTreeNode<Integer>(60);
    root.right.right = new BinaryTreeNode<Integer>(80);
    boolean result = BstSearch.contains(root, 60);
    assertTrue(result);
  }

  @Test void binarySearchTreeReturnFalseIfTargetIsInNotInTree() {
    BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(50);
    
    root.left = new BinaryTreeNode<Integer>(30);
    root.left.right= new BinaryTreeNode<Integer>(40);
    root.left.left = new BinaryTreeNode<Integer>(20);
    
    root.right = new BinaryTreeNode<Integer>(70);
    root.right.left = new BinaryTreeNode<Integer>(60);
    root.right.right = new BinaryTreeNode<Integer>(80);
    boolean result = BstSearch.contains(root, 62);
    assertFalse(result);
  }



}
