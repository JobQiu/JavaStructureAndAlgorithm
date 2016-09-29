package LeetCode;

/**
 * Created by JobQ on 9/28/2016.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 Example 1:
 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0
 Example 2:
 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5
 */
public class Problem4 {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = combineTwoArrays(nums1,nums2);
        if(result.length%2==1)
            return result[result.length/2];
        else{
            System.out.println(result[result.length/2]+" "+result[result.length/2-1]);
            return (double)(result[result.length/2]+result[result.length/2-1])/2;}
    }
    private static int[] combineTwoArrays(int[] nums1, int[] nums2){
        int[] result=new int[nums1.length+nums2.length];
        int j=0;
        int k =0;
        while ((j+k)<(result.length)) {
            if(k==nums2.length){
                result[j+k]=nums1[j++];
                continue;
            }
            if(j==nums1.length){
                result[j+k]=nums2[k++];
                continue;
            }
            if(nums1[j]<nums2[k]){
                result[j+k]=nums1[j++];
            }
            else
                result[j+k]=nums2[k++];
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
        return result;
    }
}
