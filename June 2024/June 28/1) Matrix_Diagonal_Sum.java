class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int diagonal1 = 0, diagonal2 = 0;

        for(int i = 0 ; i < n; i++)
        {
            diagonal1 += mat[i][i];

            diagonal2 += mat[i][n - 1 - i];
        }

        if(n % 2 != 0)
           diagonal2 -= mat[n / 2][n / 2];

        return diagonal1 + diagonal2;
        
    }
}
