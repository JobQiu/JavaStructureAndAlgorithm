package LeetCode;

/**
 * Created by JobQ on 9/30/2016.
 * given a sorted array, delete the third duplicate number
 * for example, given 1 1 1 2 2 3 3 3
 * return 1 1 2 2 3 3
 */
public class Page007 {
    public static void main(String[] args) {
        int[] num ={1,1,1,1,2,2,2,2,3,3,4,5,6,6,6,7,8,9,9,9,9};
        num=removeDuplicates(num);
        for (int i : num
             ) {
            System.out.println(i);
        }
    }
    public static int[] removeDuplicates(int []num){
        if (num==null||num.length<3)
            return num;
        int duplCount=0;
        int move=0;
        int end=num.length;
        for (int i = 1; i < (end-move); i++) {
            if (num[i]==num[i-1])
                duplCount++;
            else
                duplCount=0;
            if(duplCount==2){
                num[i]=num[i+move];
                move++;
                duplCount--;

                i--;
            }
            else
                num[i+1]=num[i+move+1];
        }
        int[] result = new int[num.length-move];
        for (int i = 0; i < result.length; i++) {
            result[i]=num[i];
        }
        return result;
    }
}
