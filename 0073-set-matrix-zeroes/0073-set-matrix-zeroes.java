class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(row[r] || col[c])
                {
                    matrix[r][c]=0;
                }
            }
        }
    }
}