import java.util.*;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class levelOrderTraversal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root element: ");

        int ele = sc.nextInt();

        TreeNode root = new TreeNode(ele);

        createTree(root,sc);

        System.out.println("Level-Order Traversal:");
        levelOrderTraversal(root);
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

    public static void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                System.out.println();

                if (!queue.isEmpty()) {
                    queue.offer(null);
                }
            } else {
                System.out.print(current.value + " ");

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }
        }
    }
}
