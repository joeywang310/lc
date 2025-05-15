package two_pointer_250512;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author: wangzhicheng
 * @createTime: 2025/05/13 22:20
 * @description:
 */
public class 验证回文字符串_第125题 {
    public static void main(String[] args) {
        String s = "A man, a plan, a cfanal: Panama";
//        int[] nums = {1,1,2};
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int prefix = 0;
        int tail = s.length() - 1;
        while (prefix < tail) {
            // 找到最左边的字母
            while( prefix < tail && !Character.isLetterOrDigit(s.charAt(prefix))){
                prefix++;
            }
            while( prefix < tail && !Character.isLetterOrDigit(s.charAt(tail))){
                tail--;
            }
            if (prefix < tail) {
                if (Character.toLowerCase(s.charAt(prefix)) != Character.toLowerCase(s.charAt(tail))) {
                    return false;
                } else {
                    prefix++;
                    tail--;
                }
            }
        }
        return true;
    }
}
