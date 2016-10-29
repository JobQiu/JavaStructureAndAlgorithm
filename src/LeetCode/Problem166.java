package LeetCode;

/**
 * Created by JobQ on 9/30/2016.
 * Given two integers representing the numerator
 * and denominator of a fraction, return the
 * fraction in string format.
 If the fractional part is repeating,
 enclose the repeating part in parentheses.
 For example,
 Given numerator = 1, denominator = 2, return "0.5".
 Given numerator = 2, denominator = 1, return "2".
 Given numerator = 2, denominator = 3, return "0.(6)".
 */
public class Problem166 {
    public static void main(String[] args) {
        double i = (double)8/7;
        System.out.println(Double.toString(i));
        String answer = Double.toString(i);
        String answer2[] = answer.split("\\.");
        System.out.println(answer2[1]);
        System.out.println(8/7+"."+(double)(1/7));
    }
//    public String fractionToDecimal(int numerator, int denominator) {
//        if()
//    }
}
