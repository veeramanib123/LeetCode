class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String out="";
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i].charAt(i) == '1')
            {
                out+="0";
            }
            else
            {
                out+="1";
            }
        }
    return out;
        
    }
}