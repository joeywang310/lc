package hash_table.date20250516;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/15 22:26
 * @description:
 */
public class 第217题_存在重复元素 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int num : nums) {
            if (!map.add(num)) {
                return true;
            }
        }
        return false;
    }
}
