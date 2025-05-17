package hash_table.date20250517;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wangzhicheng
 * @createTime: 2025/05/17 12:49
 * @description:
 */
public class 第387_字符串中的第一个唯一字符 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabcd"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < charArray.length; i++) {
            if (map.get(charArray[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
