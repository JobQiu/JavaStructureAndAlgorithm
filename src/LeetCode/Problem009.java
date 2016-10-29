package LeetCode;

/**
 * Created by JobQ on 10/1/2016.
 * Determine whether an integer
 * is a palindrome. Do this without extra space.
 */
public class Problem009 {
    public static void main(String[] args) {
        int x= 1001;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x<0)
            return false;
        int y=0,temp=x;
        while (temp>0){
            y=temp%10+y*10;
            temp=temp/10;
        }
        if (y==x)
            return true;
        return false;

    }
}
