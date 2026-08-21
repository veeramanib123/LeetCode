class Solution {
    public int lengthOfLIS(int[] nums) {
        int best=0;
        if(nums==null || nums.length==0) return 0;
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=1;
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            best=Math.max(best,dp[i]);
        }
        return best;
    }
}