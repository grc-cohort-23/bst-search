import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
   
    @Test 
    void contains_ints(){
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(25, 
            new BinaryTreeNode<Integer>(5, 
            new BinaryTreeNode<Integer>(2), new BinaryTreeNode<Integer>(20)),
             new BinaryTreeNode<>(30,
                new BinaryTreeNode<>(27), new BinaryTreeNode<>(42)
             ));
             assertEquals(true, BstSearch.contains(root, 27));;
    }
}
