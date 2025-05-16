package hash_table.date20250516;

import java.util.*;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/15 22:26
 * @description:
 */
public class 第49题_字母异位词分组 {

    public static void main(String[] args) {
        String[] nums = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(nums));
        System.out.println((int)'汪');
        System.out.println((int)'志');
        System.out.println('汪' - '志');
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>())
                    .add(str);
        }
        return new ArrayList<>(map.values());
    }
}
