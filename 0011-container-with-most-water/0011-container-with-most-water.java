class Solution {
    public int maxArea(int[] height) {
        int maxi=Integer.MIN_VALUE;
        int l=0,r=height.length-1;
        while(l<r)
        {
        maxi=Math.max(maxi,Math.min(height[l],height[r])*(r-l));
        if(height[l]<height[r])
        {
            l++;
        } 
        else
        {
            r--;
        }
        }       
        return maxi;
    }
}