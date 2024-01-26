package Study;

import java.util.Scanner;

class TreeNode4 {
    int data;
    TreeNode4 left;
    TreeNode4 right;

    // Constructor
    public TreeNode4(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BSTAll {
    TreeNode4 root;

    // Constructor for parameter ->bst
    public BSTAll(int rootData) {
        this.root = new TreeNode4(rootData);
    }

    // Method for invoking inserting BST:
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Method for same invoke but for value:
    private TreeNode4 insertVal(TreeNode4 root, int data) {
        if (root == null) {
            return new TreeNode4(data);
        }

        // Nested if():
        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else {
            root.right = insertVal(root.right, data);
        }
        return root;
    }

    // Traversal start():
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode4 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    private void preOrderTraversal(TreeNode4 root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode4 root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = sc.nextInt();
        BSTAll bst = new BSTAll(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            bst.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        bst.inOrderTraversal();

        System.out.println("\nPreOrder Traversal: ");
        bst.preOrderTraversal();

        System.out.println("\nPostOrder Traversal: ");
        bst.postOrderTraversal();

        sc.close();
    }
}

