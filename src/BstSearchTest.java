import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
@Test 
public void testContains() {
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
    root.left = new BinaryTreeNode<>(5);
    root.right = new BinaryTreeNode<>(15);

    assertTrue(BstSearch.contains(root, 10));
    assertTrue(BstSearch.contains(root, 5));
    assertTrue(BstSearch.contains(root, 15));
    assertFalse(BstSearch.contains(root, 20));
}
@Test 
public void testContainsNullTarget() {
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
    assertThrows(NullPointerException.class, () -> BstSearch.contains(root, null));
}

@Test 
public void testContainsEmptyTree() {
    BinaryTreeNode<Integer> root = null;
    assertFalse(BstSearch.contains(root, 10));
}
}

