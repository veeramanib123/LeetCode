class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> l=new HashSet<>();
        for (int no:nums)
        {
            l.add(no);
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