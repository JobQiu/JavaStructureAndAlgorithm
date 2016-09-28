package LeetCode;

/**
 * Created by JobQ on 9/26/2016.
 * determine whether an integer is a palindrome. do this without
 * extra space
 *
 */
public class Page29 {
    public static void main(String[] args) {
        long data = 1221;
        System.out.println(isPalindrome(data));
        data=1222;
        System.out.println(isPalindrome(data));
        data=1;
        System.out.println(isPalindrome(data));
        data=-1;
        System.out.println(isPalindrome(data));

    }
    public static boolean isPalindrome(long number){
        long temp=0;
        long y=0;
        if (number<0)
            return false;
        else if (number==0)
            return true;
        else {
            temp=number;
            while(number!=0){
                y=y*10+number%10;
                number=number/10;
            }
            if (temp==y)
                return true;
            else return false;
        }
    }

}
