package two_pointer_250512;

import java.util.Arrays;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/13 16:56
 * @description:
 */
public class 两数之和2_第167题 {
    public static void main(String[] args) {
        int[] numbers = new int[] {-10,-8,-2,1,2,5,6};
        System.out.println(Arrays.toString(twoSum(numbers, 0)));
    }

    /**
     * 思路，双指针，一个指针从头，一个指针从尾开始，
     * 因为是个有序数组，
     * 头尾相加，如果大于target， 则左指针++，头尾之和变大，
     * 如果小于target,则右指针++，头尾之和变小
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right --;
            }
        }
        return new int[] {-1, -1};
    }

    // 无效双指针，实际上还是两层循环
//    public static int[] twoSum(int[] numbers, int target) {
//        int left = 0, right = left + 1;
//        while (left< numbers.length && right< numbers.length) {
//            int sum = numbers[left] + numbers[right];
//            if (sum == target) {
//                return new int[] {left, right};
//            } else if (sum < target && right< numbers.length-1) {
//                right++;
//            } else {
//                left ++;
//                right = left + 1;
//            }
//        }
//        return new int[] {-1, -1};
//    }
}
