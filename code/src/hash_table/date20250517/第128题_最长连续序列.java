package hash_table.date20250517;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/16 22:46
 * @description:
 */
public class 第128题_最长连续序列 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (Integer key : set) {
            // 判断连续序列七点，如果 key -1 不在set中，说明key是连续序列的起点
            if (!set.contains(key - 1)) {
                int count = 1;
                int num = key;
                while (set.contains(num + 1)) {
                    count++;
                    num = num + 1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    /**
     * 从右到左遍历，找到最长的连续序列，这个算法会存在空跑的情况，不是最优解
     * 在极端的情况下，时间复杂度是O(n^2)
     * 如果提前把map.keySet()排序，会避免空跑情况，但是时间复杂度会变成O(N log N)
     * @param nums
     * @return
     */
    public static int longestConsecutive1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 0);
        }
        int max = 1;
        Set<Integer> integers = map.keySet();
        for (Integer key : integers) {
            int count = 1;
            int num = key;
            while (map.containsKey(num - 1)) {
                int i = map.get(num - 1);
                if (i != 0) {
                    count += i;
                    break;
                } else {
                    count++;
                    num = num - 1;
                }
            }
            map.put(key, count);
            max = Math.max(max, count);
        }
        return max;
    }
}
