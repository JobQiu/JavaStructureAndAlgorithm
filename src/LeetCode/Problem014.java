package LeetCode;

/**
 * Created by JobQ on 10/1/2016.
 * Write a function to find the
 * longest common prefix string amongst an array of strings.
 */
public class Problem014 {
    public static void main(String[] args) {
        String [] strings = {"aa","a"};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result="";
        if(strs==null)
            return result;
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        int minLength=strs[0].length();
        for (int i = 1; i < strs.length ; i++) {
            minLength=Math.min(minLength,strs[i].length());
        }
        for (int i = 0; i <minLength; i++) {
            int j;
            for (j =1; j < strs.length; j++) {
                if (strs[j].charAt(i)==strs[0].charAt(i))
                    continue;
                else
                    return result;
            }
            if (j==strs.length)
                result=result.concat(String.valueOf(strs[0].charAt(i)));
            //System.out.println(result);
        }
        return result;
    }
}
