package LeetCode;

/**
 * Created by JobQ on 9/30/2016.
 * Rotate an array of n elements to the right by k steps.

 For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7]
 is rotated to [5,6,7,1,2,3,4].
 */
public class Problem189 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8};
        long start = System.currentTimeMillis();
        rotate(nums,20);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
    public static void rotate(int[] nums, int k) {
        k=k>nums.length?k%nums.length:k;
        int[] temp =new int[k];
        int j=nums.length-1;
        for (int i = k-1; i >= 0 ; i--) {
            temp[i] = nums[j--];
        }
        for (int i = nums.length-1; i >=k ; i--) {
            nums[i]=nums[i-k];
        }
        for (int i = 0; i < k ; i++) {
            nums[i]=temp[i];
        }
    }

    public void rotate2(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}
