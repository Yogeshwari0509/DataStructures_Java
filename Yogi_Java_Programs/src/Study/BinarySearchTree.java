package Study;

import java.util.Scanner;

class TreeNode3 {
    int data;
    TreeNode3 left;
    TreeNode3 right;

    // Constructor
    public TreeNode3(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    TreeNode3 root;

    // Constructor for parameter ->bst
    public BinarySearchTree(int rootData) {
        this.root = new TreeNode3(rootData);
    }

    // Method for invoking inserting BST:
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Method for same invoke but for value:
    private TreeNode3 insertVal(TreeNode3 root, int data) {
        if (root == null) {
            return new TreeNode3(data);
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

    private void inOrderTraversal(TreeNode3 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int rootValue = sc.nextInt();
        BinarySearchTree bst = new BinarySearchTree(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            bst.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        bst.inOrderTraversal();
        
        sc.close();
    }
}
