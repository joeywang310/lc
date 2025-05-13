import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangzhicheng
 * @createTime: 2024/11/28 18:39
 * @description:
 */
public class lc1两数之和 {

    public static void main(String[] args) {
        int[] x = twoSum(new int[]{3,2,4}, 6);
        System.out.println(Arrays.toString(x));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer i1 = map.get(target - nums[i]);
            if (i1 != null && i1 != i) {
                return new int[]{i, i1};
            }
        }
        return null;
    }
}
