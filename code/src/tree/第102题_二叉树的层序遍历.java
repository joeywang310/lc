package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/18 22:33
 * @description:
 */
public class 第102题_二叉树的层序遍历 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        List<List<Integer>> lists = levelOrder(root);
        System.out.println(lists);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            List<Integer> value = new LinkedList<>();
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = deque.removeFirst();
                value.add(treeNode.val);
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
            res.add(value);
        }
        return res;
    }


    /**
     * 实现一，思路同BFS一致，但是使用了辅助函数，用了两层while循环，不够优雅。如果数深度很深，会有栈溢出风险。
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        while (deque != null) {
            deque = levelOrder1(deque, res);
        }
        return res;
    }

    public static ArrayDeque<TreeNode> levelOrder1(ArrayDeque<TreeNode> deque, List<List<Integer>> res) {
        if (deque == null || deque.isEmpty()) {
            return null;
        }
        List<Integer> value = new LinkedList<>();
        ArrayDeque<TreeNode> subQueue = new ArrayDeque<>();
        while (!deque.isEmpty()) {
            TreeNode treeNode = deque.removeFirst();
            value.add(treeNode.val);
            if (treeNode.left != null) {
                subQueue.addLast(treeNode.left);
            }
            if (treeNode.right != null) {
                subQueue.addLast(treeNode.right);
            }
        }
        res.add(value);
        return subQueue;
    }


}
