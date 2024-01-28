package Study;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    TreeNode root;

    // Constructor using main class passing the parameter
    public Tree(int rootData) {
        // This object is for tree node and for data
        this.root = new TreeNode(rootData);
    }

    // Method for invoking insert
    public void insert(int data) {
        root = insertVal(root, data);
    }

    // Loop don't need for working overall
    private TreeNode insertVal(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else {
            if (data > root.data) {
                root.right = insertVal(root.right, data);
            }
        }

        return root;
    }

    // Order
    // Preorder - RO L R
    // Inorder - L RO R
    // Post order - L R RO

    // Root decides before allocation -> Pre-order
    public void inorder() {
        // To get the base for L & R i.e., root
        inorderVal(root); // It gets allocated
    }

    // Orderwise allocate
    private void inorderVal(TreeNode root) {
        if (root != null) {
            // Left
            inorderVal(root.left);
            // Root
            System.out.println(root.data + " ");
            // Right
            inorderVal(root.right);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a root value: ");
        int rootValue = sc.nextInt();

        // Object
        Tree tree = new Tree(rootValue);

        System.out.println("Enter the number of nodes: ");
        int numNodes = sc.nextInt();

        // To run globally so that all the nodes are created and data implemented
        for (int i = 0; i < numNodes; i++) {
            System.out.println("Enter the element: ");
            int nodeData = sc.nextInt();
            tree.insert(nodeData);
        }

        // Display the inorder traversal of the binary tree
        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder();
        sc.close();
    }
}
