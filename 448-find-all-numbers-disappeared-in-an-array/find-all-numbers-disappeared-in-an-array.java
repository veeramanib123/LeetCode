class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> l=new HashSet<>();
        for (int i=0;i<n;i++)
        {
            if (!l.contains(nums[i]))
            {
                l.add(nums[i]);
            }
        }
        List<Integer> n1=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(l.contains(i))
            {
                continue;
            }
            else
            {
                n1.add(i);
            }
        }
        return n1;
        
    }
}