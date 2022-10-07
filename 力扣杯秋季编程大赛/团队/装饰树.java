package 力扣杯秋季编程大赛.团队;

public class 装饰树 {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(7);
        root.left=new TreeNode(5);
        root.right=new TreeNode(6);
        TreeNode newnode=expandBinaryTree(root);
        System.out.println(newnode);
    }


    public static TreeNode expandBinaryTree(TreeNode root) {

            TreeNode leftNode=root;
            TreeNode rightNode=root;
            while (leftNode.left != null||rightNode.right != null) {
                while (leftNode.left != null) {
                    TreeNode n = new TreeNode(-1);
                    n.left = leftNode.left;
                    leftNode.left = n;
                    leftNode = n.left;
//                    TreeNode leftNode1 = leftNode;
                    while (leftNode.right != null) {
                        TreeNode m = new TreeNode(-1);
                        m.right = leftNode.right;
                        leftNode.right = m;
                        leftNode = m.right;
                    }
                    leftNode = n.left;
                }
                while (rightNode.right != null) {
                    TreeNode m = new TreeNode(-1);
                    m.right = rightNode.right;
                    rightNode.right = m;
                    rightNode = m.right;
//                    TreeNode newR = rightNode;
                    while (rightNode.left != null) {
                        TreeNode n = new TreeNode(-1);
                        n.left = rightNode.left;
                        rightNode.left = n;
                        rightNode = n.left;
                    }
                    rightNode = m.right;
                }
            }
            return root;
    }
}
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return val+ "" + left+ "" + right;
    }
}