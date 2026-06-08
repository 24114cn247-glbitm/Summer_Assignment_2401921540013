//package Week_1.Day_4;

public class Reshape_the_matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        Solution s = new Solution();
        for(int[] row : s.matrixReshape(mat,r,c)){
            for(int x : row){
                System.out.print(+x + " ");
            }
        }
    }
}

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if((rows*cols)!=(r*c)) return mat;
        int[][] output = new int[r][c];
        int col = 0;
        int row = 0;
        for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
            output[row][col] = mat[i][j];
            col++;
            if(col == c){
                col=0;
                row++;
            }
          }
        }
        return output;
    }
}