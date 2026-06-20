public class Matrix_diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
       // for(int x : mat){
         //   System.out.println(x + " ");
        //}
        System.out.println("Matrix is given : "+"{1,2,3},{4,5,6},{7,8,9}");
        Solution s = new Solution();
        System.out.println("Matrix of diagonal sum is : "+s.diagonalSum(mat));
    }
    
}

class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for(int i = 0;i < len;i++){
            sum += mat[i][i];
            sum += mat[len-1-i][i];    
        }
        if(len % 2 != 0){
            sum -= mat[len/2][len/2];
        }
        return sum;
    }
}