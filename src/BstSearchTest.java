import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void containsEmptyTree() {
        BinaryTreeNode<Integer> root = null;

        assertFalse(BstSearch.contains(root, 5));
    }

    @Test
    void containsSingleNodeWhenTargetMatches() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);

        assertTrue(BstSearch.contains(root, 5));
    }

    @Test
    void containsSingleNodeWhenTargetDoesNotMatch() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);

        assertFalse(BstSearch.contains(root, 10));
    }

    @Test
    void containsTargetInLeftSubtree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8, new BinaryTreeNode<>(4), new BinaryTreeNode<>(12));

        assertTrue(BstSearch.contains(root, 4));
    }

    @Test
    void containsTargetDeeperInRightSubtree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(
            8,
            new BinaryTreeNode<>(4),
            new BinaryTreeNode<>(
                12,
                new BinaryTreeNode<>(10),
                new BinaryTreeNode<>(15)
            )
        );

        assertTrue(BstSearch.contains(root, 10));
        assertTrue(BstSearch.contains(root, 15));
    }

    @Test
    void returnsFalseWhenTargetIsMissing() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(
            8,
            new BinaryTreeNode<>(4),
            new BinaryTreeNode<>(
                12,
                new BinaryTreeNode<>(10),
                new BinaryTreeNode<>(15)
            )
        );

        assertFalse(BstSearch.contains(root, 1));
        assertFalse(BstSearch.contains(root, 20));
    }

    @Test
    void throwsExceptionWhenTargetIsNull() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);

        assertThrows(NullPointerException.class, () -> BstSearch.contains(root, null));
    }

    @Test
    void worksWithStrings() {
        BinaryTreeNode<String> root = new BinaryTreeNode<>("m", new BinaryTreeNode<>("f"), new BinaryTreeNode<>("t"));

        assertTrue(BstSearch.contains(root, "m"));
        assertTrue(BstSearch.contains(root, "t"));
        assertFalse(BstSearch.contains(root, "z"));
    }
}
