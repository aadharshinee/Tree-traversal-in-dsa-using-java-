// Define a Node class
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

// Define a BinaryTree class
class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // In-order traversal: Left, Root, Right
    void inOrderTraversal(Node node) {
        if (node == null)
            return;

        inOrderTraversal(node.left);
        System.out.print(node.value + " ");
        inOrderTraversal(node.right);
    }

    // Pre-order traversal: Root, Left, Right
    void preOrderTraversal(Node node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    // Post-order traversal: Left, Right, Root
    void postOrderTraversal(Node node) {
        if (node == null)
            return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        // Manually creating a binary tree with 10 nodes
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right = new Node(9);
        tree.root.left.left.right.left = new Node(1);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left = new Node(8);

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);  

        System.out.println("\nPre-order traversal:");
        tree.preOrderTraversal(tree.root); 

        System.out.println("\nPost-order traversal:");
        tree.postOrderTraversal(tree.root); 
    }
}
