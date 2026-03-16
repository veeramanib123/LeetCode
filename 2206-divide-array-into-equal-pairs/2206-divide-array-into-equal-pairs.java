class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            if(!set.add(n)){set.remove(n);}
        }
        return set.isEmpty();
        
    }
}