package LeetCode;

/**
 * Created by JobQ on 9/26/2016.
 * search a value in a m*n matrix
 * and the matrix has the following properties:
 * 1. every row is a sorted ascending array
 * 2. every column is a sorted ascending array
 */
public class Page30 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};

        for (int i = 0; i < 51; i++) {
            System.out.println(isExisted2(matrix,i)+"\twhen i = "+i);
        }



    }
//    public static boolean isExisted(int[][] matrix,int value){
//        int upperBound = matrix.length-1;
//        int lowerBound = 0;
//        int curIn,curIn2;
//        while (true){
//            curIn=(upperBound+lowerBound)/2;
//            if (matrix[curIn][0]<value&&matrix[curIn+1][0]>value)
//                break;
//            if (matrix[curIn][0]>value)
//                upperBound=curIn-1;
//            else
//                lowerBound=curIn+1;
//            if (upperBound<lowerBound)
//                return false;
//        }
//        upperBound=matrix[curIn].length-1;
//        lowerBound=0;
//        while (true){
//            curIn2=(upperBound+lowerBound)/2;
//            if (matrix[curIn][curIn2]==value)
//                return true;
//            if (matrix[curIn][curIn2]>value)
//                upperBound=curIn2-1;
//            else
//                lowerBound=curIn2+1;
//            if(upperBound<lowerBound)
//                return false;
//
//
//        }
//
//
//    }

    public static  boolean isExisted2(int[][] matrix,int value){
        if (matrix.length==0)
            return false;
        if (matrix[0].length==0)
            return false;
        int row=0;
        int column = matrix[0].length-1;

        while (row<matrix.length)
            if (value>matrix[row][column])
                row++;
        System.out.println(row);
        return true;
//
//        while(column>-1) {
//            if (value < matrix[row][column])
//                column--;
//            if (value==matrix[row][column])
//                return true;
//        }
//        return false;
    }
}
