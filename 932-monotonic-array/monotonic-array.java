class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ic=false;
        boolean dc=false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                dc=true;
            }
            if(nums[i]<nums[i+1])
            {
                ic=true;
            }
            if(ic && dc) return false;
        }
        return true;
    }
}