public class BstSearch {
    /**
     * Returns whether a binary search tree contains a given value.
     * 
     * As a precondition, the input root is assumed to be the root of a binary
     * search tree; this is not validated by the method. Passing in an invalid
     * tree causes undefined behavior.
     * 
     * A null value for the root is considered to represent a valid but empty
     * binary search tree. A null root will cause this method to always return
     * false if a valid target is given.
     * 
     * This method must run in O(log(n)) if the tree is balanced, where n is the # of
     * nodes in the tree. In other words, this method should NOT search every node -
     * it should take advantage of the binary search tree properties to efficiently
     * search.
     * 
     * @param <T> The type of the values held in the nodes
     * @param root the root of the binary search tree (assumed to be valid)
     * @param target the value to search for
     * @return true if the target is contained in the tree, false otherwise
     * @throws NullPointerException if target is null
     */
    public static <T extends Comparable<T>> boolean contains(BinaryTreeNode<T> root, T target) {
        // Implement here, and make sure to implement tests too!

        if (root == null) {
            return false;
        }

        //had to jog my memory, compareTo produces an integer value that shows the relationship between two objects
        //0 if objects are equal, <0 if the second object is larger, and >0 if the first object is greater
        int comparable = root.data.compareTo(target);

        if (comparable == 0) {
            return true;
        } else if (comparable > 0) {
            
            //current node is greater than the target node
            return contains(root.left, target);
        } else {
            return contains(root.right, target);
        }

    }
}
