package tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/17 15:33
 * @description:
 */
public class 第145题_二叉树的后序遍历 {

    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preorderTraversal(root, list);
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
        list.add(root.val);
        return list;
    }
}
