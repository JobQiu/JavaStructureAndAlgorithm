package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by JobQ on 9/26/2016.
 */
public class Problem3 {
    public static void main(String[] args) {
        String test="abcadefawyzhijka";
        System.out.println(lengthOfLongestSubstring(test));
    }
    /**
     * the most easy method, check one by one
     * */
    public static int lengthOfLongestSubstring2(String s){
        int max=0;// record the max length
        int start =0;
        int end ;
        for (end = 1; end < s.length(); end++) {
            char temp = s.charAt(end);
            for (int j = start; j < end ; j++) {
                if (temp==s.charAt(j)){
//                    System.out.println(true);
                    start=j+1;
                    end--;
                    break;
                }
                }
//            System.out.print("start="+start+" end="+end);
//            System.out.println(" max="+max+" start "+s.substring(start,end+1));
            max=Math.max(max,end-start+1);
        }
        return max;
    }
    /**
     * this is the first method in the report or tutorial
     *
     * */
    public static int lengthOfLongestSubstring3(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j-i);
        return ans;
    }
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    /**
     * the third method, using a sliding window
     * O(2n) level high
     * */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
// try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    /**
     * use hash map to substitute increasing i one by one, we can skip to the duplcaite
     * character
     * */
    /**
     * if the kinds variety of character is limited, e.g. a-z A-Z
     * we can use an array to record that,
     * */

}
