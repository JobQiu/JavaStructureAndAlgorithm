package LeetCode;

/**
 * Created by JobQ on 9/26/2016.
 * give a sorted array and a target value
 * return the index if you find it
 * otherwise insert it inside the array
 * no duplicated elements
 */
public class Page34 {
    public static void main(String[] args) {
        int A[] = {1,3,5,9};
        int target = 8;
        System.out.println(findOrInsert(A,target));
    }

    public static int findOrInsert(int A[], int target){
        int upperBound=A.length-1;
        int lowerBound=0;
        int curIn=0;
        while (true){
            curIn=(upperBound+lowerBound)/2;
            if (A[curIn]==target)
                return curIn;
            if (A[curIn]<target)
                lowerBound=curIn+1;
            else
                upperBound=curIn-1;
            if(upperBound<lowerBound)
                return upperBound+1;
        }


    }


}
