package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xavier.qiu
 * 5/22/18 12:57 PM
 */
public class Problem621 {

    public int leastInterval(char[] tasks, int n) {

        Map<Character, Integer> count = new HashMap();
        for (char c : tasks) {
            if (count.keySet().contains(c)) {
                int temp = count.get(c);
                count.put(c, temp + 1);
            } else {
                count.put(c, 1);
            }
        }
        int max = 0;
        for (int i : count.values()) {
            max = Math.max(i, max);
        }

        int maxCount = 0;
        for (int i : count.values()) {
            if (i == max) {
                maxCount++;
            }
        }

        return Math.max((n + 1) * (max - 1) + maxCount, tasks.length);
    }

    public int leastInterval2(char[] tasks, int n) {
        int[] count = new int[26];
        for (char c : tasks) {
            count[c - 'A']++;
        }
        Arrays.sort(count);
        int j = 24;
        int maxCount = 1;
        while (count[j] == count[25]) {
            maxCount++;
            j--;
        }
        return Math.max((n + 1) * (count[25] - 1) + maxCount, tasks.length);
    }

    /**
     * 2 situations,
     *
     * 1. no idle at all
     * if we can use other
     */

}
