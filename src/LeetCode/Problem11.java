package LeetCode;

/**
 * Created by JobQ on 9/29/2016.
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such
 * that the container contains the most water.
 */
public class Problem11 {
    public static void main(String[] args) {
        int height[]={1,2,3,4,5,7,8,9,1,10,6};
        long start=System.currentTimeMillis();
        System.out.println(maxArea(height));
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    /**
     * naive method, iterate i and j and get the maximum
     * i = 1 -> 3
     * j = 8 -> 7
     * */
    public static int maxArea2(int[] height) {
        int max=0;
        for (int i = 0; i < (height.length-1) ; i++) {
            for (int j = i; j < height.length; j++) {
                max=Math.max(Math.min(height[i],height[j])*(j-i),max);
            }
        }
        return max;
    }
    /**
     *
     * */
    public static int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}

