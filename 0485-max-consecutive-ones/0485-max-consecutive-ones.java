class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,c=0,max=0;
        while(i<nums.length)
        {
            if(nums[i]!=1)
            {
                c=0;
            }
            else
            {c++;}
            max=Math.max(max,c);
            i++;
        }
        return max;
    }
}