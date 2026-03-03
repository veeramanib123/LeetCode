class Solution {
    public int diagonalSum(int[][] mat) {
        int s1=0,s2=0,n=mat.length-1;
        if(mat.length==0)
        {
            return mat[0][0];
        }
        for(int i=0;i<=n;i++)
        {
            s1+=mat[i][i];
            s2+=mat[i][n-i];
        }
        if(n%2==0)
        {
            s1-=mat[n/2][n/2];
        }
        return s1+s2;
        
    }
}