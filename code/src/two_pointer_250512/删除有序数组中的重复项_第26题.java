package two_pointer_250512;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/13 22:20
 * @description:
 */
public class 删除有序数组中的重复项_第26题 {
    public static void main(String[] args) {
        int[] nums  = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int prefix = 0;
        int tail = 1;
        while (tail < nums.length) {
            if (nums[prefix] == nums[tail]) {
                tail++;
            } else {
                prefix++;
                nums[prefix] = nums[tail];
                tail++;
            }
        }
        return prefix + 1;

    }
}
