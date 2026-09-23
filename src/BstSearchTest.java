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


  

}
