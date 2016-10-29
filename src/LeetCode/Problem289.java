package LeetCode;

/**
 * Created by JobQ on 10/3/2016.
 * Game of Life
 * https://leetcode.com/problems/game-of-life/
 */
public class Problem289 {
    public static void main(String[] args) {
        int[][] board=new int[7][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]=(Math.random()<0.5)?0:1;
            }
        }
        displayBoard(board);
        int[][] result=new int[7][10];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]=countLive(board,i,j);
            }
        }
        System.out.println("");
        displayBoard(result);
        gameOfLife(board);
        System.out.println("");
        displayBoard(board);
    }
    public static void gameOfLife(int[][] board) {
        int height = board.length;
        int width;
        try{
         width = board[0].length;}
        catch (Exception e){
            return;
        }
        int[][] result = new int[height][width];
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int temp=countLive(board,i,j);
                if(board[i][j]==1){
                    if(1<temp&&temp<4){
                        result[i][j]=1;
                    }else{
                        result[i][j]=0;
                    }
                }else {
                    if(temp==3)
                        result[i][j]=1;
                    else
                        result[i][j]=0;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=result[i][j];
            }
        }
    }//end of the function



    public static int countLive(int[][] board,int i, int j){
        int result = 0;
        int temp;
        for (int k = i-1; k < i+2 ; k++) {
            for (int l = j-1; l <j+2 ; l++) {
                try{
                temp = board[k][l];
                }
                catch (Exception e){
                    temp=0;
                }
                result+=temp;
            }
        }
        result-=board[i][j];
        return result;

    }
    public static void displayBoard(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
