class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=-1;
        int end=-1,i,j;
        for(i=0,j=nums.length-1;i<nums.length && j>=0;i++,j--)
        {
            if(nums[i]==target)
            {
                end=i;
            }
            if(nums[j]==target)
            {
                start=j;
            }
        }
        return new int[]{start,end};        
    }
}