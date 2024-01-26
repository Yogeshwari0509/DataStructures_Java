package Study;
import java.util.Scanner;

class TreeNode

{

int data;

TreeNode left;

TreeNode right;l

//Constructor

public TreeNode(int data)

{

this.data= data;

this.left=null;

this.right=null;

}

}

//Main class

public class BinaryTree

{

TreeNode root;

//Constructor using main class passing the parameter

public BinaryTree(int rootData)

{

//this obj is for tree node and for data

this.root = new TreeNode(rootData);

}

//inorder to store and return we give void

//Method for invoking insert

public void insert(int Data)

{

root=insertVal(root,Data);

}

//loop dont need for working overall

private TreeNode insertVal (TreeNode root,TreeNode Data);

{

if(root == null)

{

root=new TreeNode(data);

return root;

}

if(data < root.data)

{

root.left=insertVal(root.left,data);

}

else

{

if(data > root.data)

{

root.right = insertVal(root.right,data);

}

return root;

}

//Order

//preorder -RO L R

//inorder - L RO R

//post order - L R RO

//root decide before:allocation->Pre-order:

public void Inorder()

{

//y inorder to get the base for L & R ie root

InorderVal(root);// it gets allocated

}

//Orderwise allocate

private void InorderVal(TreeNode root)

{

if(root == null)

{

//

InorderVal(root.left)

System.out.println(root.data +" ");

//right

InorderVal(root.right);

}

}

public class void main(String args[])

{

Scanner sc= new Scanner(System.in);

System.out.println("Enter a root value: ");

int rootValue = sc.nextInt();

//y obj

BinaryTree tree=new BinaryTree(rootValue);

//eg: root =1

// node=5

//then 10 20 30 40 050

// branch also 5

System.out.println("enter the number of node value: ");

//to get the node a variable

int numNode= sc.nextInt();

//too run globally so that all the node are created and data implement

for(int i=0;i<numNode;i++)

{

System.out.println("Enter the element: ");

}

}

}

}
