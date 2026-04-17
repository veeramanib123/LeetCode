class Solution {
    public int countNegatives(int[][] grid) {
        int c=0,r=grid.length,cl=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(grid[i][j]<0)
                {
                    c+=1;
                }
            }
        }
        return c;
    }
}