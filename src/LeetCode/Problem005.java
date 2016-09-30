package LeetCode;

/**
 * Created by JobQ on 9/29/2016.
 * Given a string S, find the longest palindromic
 * substring in S. You may assume that the maximum
 * length of S is 1000, and there exists one unique
 * longest palindromic substring.
 */
public class Problem005 {
    public static void main(String[] args) {
        String s="helloworld";
        System.out.println(longestPalindrome(s));
    }


    public static String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
