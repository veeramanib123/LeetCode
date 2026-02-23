class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] nums3=new int[n];
        int i,index=0;
        for(i=0;i<nums1.length;i++)
        {
            nums3[index]=nums1[i];
            index++;
        }
        for(i=0;i<nums2.length;i++)
        {
            nums3[index]=nums2[i];
            index++;
        }
        Arrays.sort(nums3);
        if(n%2==0)
        {
            return (nums3[n/2]+nums3[(n/2)-1])/2.0;
        }
        else
        {
            return nums3[n/2];
        }
    }
}