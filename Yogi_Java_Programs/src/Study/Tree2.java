package Study;
import java.util.Scanner;

class TreeNode2 {
    int data;
    TreeNode2 left;
    TreeNode2 right;

    // Constructor
    public TreeNode2(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Main class
public class Tree2 {
    TreeNode2 root;

    // Constructor using Main class passing the parameter
    public Tree2(int rootData) {
        this.root = new TreeNode2(rootData);
    }

    // Method for invoking insert
    public void insert(int data) {
        root = insertVal(root, data);
    }

    private TreeNode2 insertVal(TreeNode2 root, int data) {
        if (root == null) {
            root = new TreeNode2(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertVal(root.left, data);
        } else if (data > root.data) {
            root.right = insertVal(root.right, data);
        }
        return root;
    }

    // Order-wise allocate
    public void inOrder() {
        inOrderVal(root);
    }

    private void inOrderVal(TreeNode2 root) {
        if (root != null) {
            inOrderVal(root.left);
            System.out.print(root.data + " ");
            inOrderVal(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Root value: ");
        int rootValue = sc.nextInt();
        Tree2 tree = new Tree2(rootValue);

        System.out.println("Enter the number of node value: ");
        int numNode = sc.nextInt();

        for (int i = 0; i < numNode; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            int nodeValue = sc.nextInt();
            tree.insert(nodeValue);
        }

        System.out.println("InOrder Traversal: ");
        tree.inOrder();
        sc.close();
    }
}