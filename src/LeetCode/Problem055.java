package LeetCode;

/**
 * Created by JobQ on 9/29/2016.
 * Given an array of non-negative integers, you are initially positioned at the
 * first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 Determine if you are able to reach the last index.
 For example:
 A = [2,3,1,1,4], return true.
 A = [3,2,1,0,4], return false.
 */
public class Problem055 {
    public static void main(String[] args) {
        int[] nums = {2,0,0};
        System.out.println(canJump(nums));
}
    //1. 递归 recursive
    // this method will cause stack overflow
    public static boolean canJump2(int[] nums) {
        return judge(nums,0,nums.length-1);
    }
    private static boolean judge(int[] nums,int start, int end){
        if(end==start)
            return true;
        if(nums==null)
            return false;

        if(nums[start] == 0 && nums.length>1)
            return false;
        if (nums[start]== (end-start))
            return true;
        for (int i = start+1; i <= nums[0]; i++) {
            if(judge(nums,i,end)==true)
                return true;
            else
                return false;
        }
        return false;
    }

    //2. pick the maximum step
    public static boolean canJump(int[] nums){
        if(nums.length==1)
            return true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                if (i==nums.length-1)
                    return true;
                int j;
                for (j = i-1; j >=0 ; j--) {
                    if (nums[j]>=(i-j+1))
                        break;//if we find a number who can skip the 0, break
                }
                if(j<0){
                    return false;
                }
            }

        }
        return true;
    }
}
