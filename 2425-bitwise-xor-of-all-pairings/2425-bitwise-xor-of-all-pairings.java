class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res=0;        
        if(nums2.length%2!=0)
        {
            for(int n:nums1)
            {
                res^=n;
            }
        }
        if(nums1.length%2!=0)
        {
            for(int n:nums2)
            {
                res^=n;
            }
        }
        return res;
    }
}