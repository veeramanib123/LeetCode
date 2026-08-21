class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int curlen=1,maxlen=1;
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]>nums[i-1])
           {
            curlen++;
           } 
           else
           {
            curlen=1;
           }
           maxlen=Math.max(maxlen,curlen);
        }
        return maxlen;
    }
}