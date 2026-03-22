class Solution {
    public boolean findRotation(int[][] matrix, int[][] target) {
       int n=matrix.length;
       boolean[] c=new boolean[4];
       Arrays.fill(c,true);
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(matrix[i][j]!=target[i][j])c[0]=false;
            if(matrix[i][j]!=target[j][n-1-i])c[1]=false;
            if(matrix[i][j]!=target[n-1-i][n-1-j])c[2]=false;
            if(matrix[i][j]!=target[n-1-j][i])c[3]=false;
        }
        
       }
return c[0]||c[1]||c[2]||c[3];
        
    }
}