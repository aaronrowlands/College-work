// BinarySearchTree class with generic type T
public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root; // Root of the binary search tree
    int comparisons;

//    // Insert method based on the binary search tree property
//    public void insert(T data) {
//        root = insertRec(root, data);
//    }

    // Insert method that counts the number of comparisons
    public void insert(T data) {
        root = insertRec(root, data);
    }

    // Recursive helper function for insertion
    private Node<T> insertRec(Node<T> root, T newdata) {
// If the root is null, create and return a new node
        if (root == null) {
            Node<T> newNode = new Node(newdata);
            root = newNode;
        }
// Compare the data with the current node's data
        int comparisons = root.data.compareTo(newdata);

// If the data is less than the current node's data, recursively insert into the left child
        if(comparisons > 0) {
            root.left = insertRec(root.left, newdata);
        }
// If the data is greater, recursively insert into the right child
        else if (comparisons < 0) {
            root.right = insertRec(root.right, newdata);
        }
// Finally, return the root
        return root;
    }


    // Add traversal methods for BinarySearchTree
    // In-Order Traversal (left -> root -> right)

    public <T> void inOrder(Node<T> root) {
// Base case: If the node is null, return
        if (root == null)
            return;
// First, recursively visit the left child
        inOrder(root.left);
// Then, print the current node's data
        System.out.print(root.data + " ");
// Finally, recursively visit the right child
        inOrder(root.right);
    }

    // Pre-Order Traversal (root -> left -> right)
    public <T> void preOrder(Node<T> root) {
// Base case: If the node is null, return
        if (root == null)
            return;
// First, print the current node's data
        System.out.print(root.data + " ");
// Then, recursively visit the left child
        preOrder(root.left);
// Finally, recursively visit the right child
        preOrder(root.right);
    }
    // Post-Order Traversal (left -> right -> root)
    public <T> void postOrder(Node<T> root) {
// Base case: If the node is null, return
        if (root == null)
            return;
// First, recursively visit the left child
        postOrder(root.left);
// Then, recursively visit the right child
        postOrder(root.right);
// Finally, print the current node's data
        System.out.print(root.data + " ");
    }

    // Method to calculate the height of the binary search tree
    public int height(Node<T> root) {

        // Base case: If the node is null, return 0
        if (root == null)
            return 0;
        // Recursively calculate the height of the left and right subtrees
        int Leftheight = height(root.left);
        int Rightheight = height(root.right);
        // Return the maximum of the two heights, plus 1 to account for the current node
        return Math.max(Leftheight, Rightheight) +1;
    }

    // Reset the comparison counter
    public void resetComparisons() {
        comparisons = 0;
    }

    // Search method that counts the number of comparisons
    public boolean search(Node<T> root, T data) {
        // Increment the comparison counter for each comparison made
        int check = root.data.compareTo(data);
        comparisons++;


        // Search for the data in the binary search tree
        if (root.data == data)
            return true;

        return false;
    }







}


