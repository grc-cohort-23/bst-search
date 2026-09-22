import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test 
    void TestTrueScenarioRoot() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode lefty = new BinaryTreeNode<Integer>(15);
        BinaryTreeNode righty = new BinaryTreeNode<Integer>(35);

        root.left = lefty;
        root.right = righty;

        assertEquals(true, BstSearch.contains(root, 25));
    }

    @Test 
    void TestTrueScenarioLeftOne() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode lefty = new BinaryTreeNode<Integer>(15);
        BinaryTreeNode righty = new BinaryTreeNode<Integer>(35);

        root.left = lefty;
        root.right = righty;

        assertEquals(true, BstSearch.contains(root, 15));
    }

    @Test void TestTrueScenarioRightOne() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode lefty = new BinaryTreeNode<Integer>(15);
        BinaryTreeNode righty = new BinaryTreeNode<Integer>(35);

        root.left = lefty;
        root.right = righty;

        assertEquals(true, BstSearch.contains(root, 35));
    }

    @Test 
    void TestTrueScenarioMultiLeft() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode lefty = new BinaryTreeNode<Integer>(15);
        BinaryTreeNode righty = new BinaryTreeNode<Integer>(35);
        BinaryTreeNode lefty2 = new BinaryTreeNode<Integer>(14);
        BinaryTreeNode lefty3 = new BinaryTreeNode<Integer>(16);

        lefty.left = lefty2;
        lefty.right = lefty3;

        root.left = lefty;
        root.right = righty;

        assertEquals(true, BstSearch.contains(root, 16));
        assertEquals(true, BstSearch.contains(root, 14));
    }

    @Test 
    void TestTrueScenarioMultiRight() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode lefty = new BinaryTreeNode<Integer>(15);
        BinaryTreeNode righty = new BinaryTreeNode<Integer>(35);
        BinaryTreeNode righty2 = new BinaryTreeNode<Integer>(34);
        BinaryTreeNode righty3 = new BinaryTreeNode<Integer>(36);

        righty.left = righty2;
        righty.right = righty3;

        root.left = lefty;
        root.right = righty;

        assertEquals(true, BstSearch.contains(root, 34));
        assertEquals(true, BstSearch.contains(root, 36));
    }

    @Test
    void TestFalseScenarioRoot() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);

        assertEquals(false, BstSearch.contains(root, 99));
    }

    @Test
    void TestFalseScenarioTwoChildren() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode lefty = new BinaryTreeNode<Integer>(15);
        BinaryTreeNode righty = new BinaryTreeNode<Integer>(35);

        root.left = lefty;
        root.right = righty;

        assertEquals(false, BstSearch.contains(root, 99));
    }


    @Test
    void TestNullScenarioTwoChildren() {
        BinaryTreeNode root = new BinaryTreeNode<Integer>(25);
        BinaryTreeNode lefty = new BinaryTreeNode<Integer>(15);
        BinaryTreeNode righty = new BinaryTreeNode<Integer>(35);

        root.left = lefty;
        root.right = righty;

        assertThrows(NullPointerException.class, () -> BstSearch.contains(root, null));
    }

     @Test
    void TestEmptyTree() {
        BinaryTreeNode root = null;

        assertEquals(false, BstSearch.contains(root, 5));
    }
    
}
