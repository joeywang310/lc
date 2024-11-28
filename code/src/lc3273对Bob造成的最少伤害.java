import java.util.Arrays;

/**
 * @author: wangzhicheng
 * @createTime: 2024/11/28 18:39
 * @description:
 */
public class lc3273对Bob造成的最少伤害 {

    public static void main(String[] args) {
        System.out.println(minDamage(8, new int[]{40}, new int[]{59}));
    }

    public static long minDamage(int power, int[] damage, int[] health) {
        int damageSum = Arrays.stream(damage).sum();
        while (true) {
            int n = getDamage(power, damage, health);
            health[n] = Math.max((health[n] - power), 0);
            for (int i = 0; i < health.length; i++) {
                if (health[i] != 0) {
                    damageSum += damage[i];
                }
            }
            boolean b = Arrays.stream(health).anyMatch(h -> h != 0);
            if (!b) {
                return damageSum;
            }
        }
    }

    private static int getDamage(int power, int[] damage, int[] health) {
        int n = 0;
        int damageSum = Integer.MAX_VALUE;

        for (int i = 0; i < health.length; i++) {
            if (health[i] > 0) {
                int max = Math.max((health[i] - power), 0);
                int result =((int) Math.ceil(((double) max) / power) * damage[i]) ;
                for (int i1 = 0; i1 < health.length; i1++) {
                    if (i1 !=i && health[i1] > 0) {
                        result += ((int) Math.ceil(((double) health[i1]) / power) * damage[i1]);
                    }
                }
                if (damageSum > result) {
                    damageSum = result;
                    n = i;
                }
            }
        }
        return n;
    }
}
