import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
   
    @Test 
    void contains_ints_true(){
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(25, 
            new BinaryTreeNode<Integer>(5, 
            new BinaryTreeNode<Integer>(2), new BinaryTreeNode<Integer>(20)),
             new BinaryTreeNode<>(30,
                new BinaryTreeNode<>(27), new BinaryTreeNode<>(42)
             ));
             assertEquals(true, BstSearch.contains(root, 27));;
    }
    
    @Test
    void contains_ints_false() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(25,
                new BinaryTreeNode<Integer>(5,
                        new BinaryTreeNode<Integer>(2), new BinaryTreeNode<Integer>(20)),
                new BinaryTreeNode<>(30,
                        new BinaryTreeNode<>(27), new BinaryTreeNode<>(42)));
        assertEquals(false, BstSearch.contains(root, 21));
        ;
    }
    
    @Test
    void contains_ints_null() {
        assertEquals(false, BstSearch.contains(null, 22));
        ;
    }
}
