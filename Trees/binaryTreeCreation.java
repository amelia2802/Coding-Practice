/*Create a binary tree an print it in preeorder traversal */

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

public class binaryTreeCreation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root element: ");

        int ele = sc.nextInt();

        TreeNode root = new TreeNode(ele);

        createTree(root,sc);

        System.out.println("Printing the binary tree: ");
        printTree(root);
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

    public static void printTree(TreeNode root){
        if(root == null){
            return;
        }

        System.out.println(root.value+" ");
        printTree(root.left);
        printTree(root.right);
    }
}