import java.util.Scanner;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right =  null;
    }
}

public class treeTraversal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root element: ");

        int root = sc.nextInt();

        TreeNode node = new TreeNode(root);

        createTree(node,sc);

        System.out.println("Printing the binary tree in Inorder traversal: ");
        inOrder(node);
        System.out.println();

        System.out.println("Printing the binary tree in Preorder traversal: ");
        preOrder(node);
        System.out.println();

        System.out.println("Printing the binary tree in Postorder traversal: ");
        preOrder(node);
    }

    public static void createTree(TreeNode root, Scanner sc){
        System.out.println("Enter the left node child element or -1 to skip for " +root.value+" node: ");

        int leftNode = sc.nextInt();

        if(leftNode!= -1){
            root.left = new TreeNode(leftNode);
            createTree(root.left,sc);
        }

        System.out.println("Enter the right node child element or -1 to skip for " +root.value+" node: ");

        int rightNode = sc.nextInt();

        if(rightNode!= -1){
            root.right = new TreeNode(rightNode);
            createTree(root.right,sc);
        }
    }

    public static void inOrder(TreeNode node){

        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    public static void preOrder(TreeNode node){

        if(node == null){
            return;
        }

        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(TreeNode node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
}