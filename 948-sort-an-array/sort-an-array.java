class Solution {
    public static int[] sortArray(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums;
        for(int i = 1; i < nums.length; i++)
        {
            int tmp = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > tmp)
            {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = tmp;
        
        }
        return nums;
    }
}