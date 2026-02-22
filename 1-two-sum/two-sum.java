class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer ,Integer> out=new HashMap<>(); 
        for(int i=0;i<nums.length;i++)
        {
            int sum=target-nums[i];
            if(out.containsKey(sum))
            {
                return new int[]{out.get(sum),i};
            }
            out.put(nums[i],i);
        }
        return new int[0];
        
    }
}