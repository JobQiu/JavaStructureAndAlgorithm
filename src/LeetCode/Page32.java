package LeetCode;

/**
 * Created by JobQ on 9/26/2016.
 * s sorted array. find the starting and ending position of
 * a given target value, return [-1,-1]
 * if you didnt find the value
 *
 */
public class Page32 {
    public static void main(String[] args) {
        int []A= {5,7,7,8,8,8,8,8,8,10};
        int target=8;
        System.out.println(findDuplicate(A,target)[0]+" "+findDuplicate(A,target)[1]);

    }

    public static int[] findDuplicate(int[]A,int target ){
        int upperBound = A.length;
        int lowerBound = 0;
        int curIn;
        int[] result= new int[2];

        while(true){
            curIn = (upperBound+lowerBound)/2;
            if(A[curIn]==target&&A[curIn-1]!=target) {
                result[0] = curIn;break;
            }
            if(A[curIn]==target)
                upperBound=curIn;
            else if (A[curIn]>target)
                upperBound=curIn-1;
            else
                lowerBound=curIn+1;
            if(upperBound<lowerBound)
                return new int[]{-1,-1};
        }
        upperBound=A.length;
        lowerBound=curIn;
        while (true){
            curIn=(upperBound+lowerBound)/2;
            if(A[curIn]==target&&A[curIn+1]!=target){
                result[1] = curIn;
                return result;
            }
            if (A[curIn]==target)
                lowerBound=curIn;
            else if(A[curIn]>target)
                upperBound=curIn;
            else
                lowerBound=curIn;
            if(upperBound<lowerBound)
                return new int[]{-1,-1};
        }
    }

}
