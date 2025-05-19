package tree;

import java.util.Stack;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/17 16:19
 * @description:
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
