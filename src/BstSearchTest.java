import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

public class BstSearchTest {

    @Test 
    public void testEmptyTree(){
        assertFalse(BstSearch.contains(null, 10));
    }

    @Test 
    public void testRootTarget(){
        //arrange
        BinaryTreeNode<Integer> root = new BinaryTreeNode<> (10);

        //assert
        assertTrue(BstSearch.contains(root,10));
    }

    @Test
    public void testLeftTarget() {
    // Arrange
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
    root.left = new BinaryTreeNode<>(5);

    // Assert
    assertTrue(BstSearch.contains(root, 5));
}

    @Test 
    public void testRightTarget(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);

        root.right = new BinaryTreeNode<>(15);

        assertTrue(BstSearch.contains(root,15));
    }
  

}
