package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JobQ on 9/28/2016.
 * give an array, e.g. [-1,0,1,2,-1,-4]
 * return no duplicate triplets that meet the requirement
 * that the sum of these three number is 0
 * for example[-1,0,1]
 */
public class Problem15 {
    public static void main(String[] args) {
       int[] nums = {-1,0,1,2,-1,-4} ;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+" ");
//        }
        System.out.println(threeSum2(nums));
//        threeSum2(nums);
//        System.out.println(binarySearch(nums,1,5,2));
    }
    /**
     * method 1:
     * there are four conditions:
     * 1. 0 + positive + negative
     * 2. two positive + one negative
     * 3. two negative + one positive
     * 4. three 0
     * since there are some duplicate elements, we can not use
     * a hash set
     * so we can split the array into two group, one contains
     * the elements that are positive and another contains
     * negative numbers. then iterate the positive one to
     *
     * since we can not find the key by the value, i gave up this method
     * */
    public static List<List<Integer>> threeSum2(int[] nums){
        List<List<Integer>> result = null;
        Arrays.sort(nums);
        // 1. spilt this into three groups
        // determine how many 0 it has
        // negative number is from 0 to start0-1
        // positive number is from end0+1 to the end
        // zero is from start0 to end 0
        int start0=nums.length,end0=0,startPositive=nums.length;
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
            if (nums[i]==0) {
                start0 = Math.min(start0, i);// the first position of 0
                end0 = Math.max(end0,i);// the last position of 0
            }
            if (nums[i]>0){
                startPositive=Math.min(startPositive, i);
            }
        }
        System.out.println("start of zero is "+start0+"\nthe last zero is in "+end0);
        // 2. slove the four situations
        // 2.1 if it dont have 0: situation 2 and 3
        List<Integer> temp = null;
        {
            for (int i = 0; i < startPositive-1 ; i++) {
                for (int j = i; j < startPositive; j++) {
                    int target = -(nums[i]+nums[j]);
                    if(binarySearch(nums,startPositive,nums.length-1,target)){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(target);
                    }
                    result.add(temp);
                    temp.clear();
                }
            }

            for (int i = startPositive; i < nums.length-1 ; i++) {
                for (int j = i; j < nums.length; j++) {
                    int target = -(nums[i]+nums[j]);
                    if(binarySearch(nums,0,startPositive-1,target)){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(target);
                    }
                    result.add(temp);
                    temp.clear();
                }
            }
        }
        // 2.2 it has a zero
        if(end0!=0) {
            //2.2.1 there are more than 3 zeros, add a list ={0,0,0}
            if (end0-start0>=2){
                temp.clear();
                temp.add(0);
                temp.add(0);
                temp.add(0);
                result.add(temp);
            }

            //2.2.2 situation 1
            for (int i = 0; i < start0; i++) {
                int target = -nums[i];
                if(binarySearch(nums,startPositive,nums.length-1,target)){
                    temp.add(nums[i]);
                    temp.add(0);
                    temp.add(target);
                    result.add(temp);
                    temp.clear();
                }
            }

        }
        return result;
    }
    private static boolean binarySearch(int[] nums, int lowerBound, int upperBound, int target){
        while(true){
            int mid = (lowerBound+upperBound)/2;
            if (nums[mid]==target)
                return true;
            if (nums[mid]<target){
                lowerBound=mid+1;
            }else
                upperBound=mid-1;
            if (upperBound<lowerBound)
                return false;
        }
    }
    /**
     *
     * */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length<3)
            return result;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || nums[i] > nums[i-1]){
                int j=i+1;
                int k=nums.length-1;
                while(j<k){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        result.add(l);
                        j++;
                        k--;
                        //handle duplicate here
                        while(j<k && nums[j]==nums[j-1])
                            j++;
                        while(j<k && nums[k]==nums[k+1])
                            k--;
                    }else if(nums[i]+nums[j]+nums[k]<0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return result;
    }
}
