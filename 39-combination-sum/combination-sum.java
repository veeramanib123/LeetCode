class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        combsum(0,target,candidates,res,sub);
        return res;
    }
    public void combsum(int ind,int t,int[] nums,List<List<Integer>> res,List<Integer> sub)
    {
        if(t==0)
        {
            res.add(new ArrayList<>(sub));
            return;
        }
        if(ind==nums.length || t<0)
        {
            return;
        }
        sub.add(nums[ind]);
        combsum(ind,t-nums[ind],nums,res,sub);
        sub.remove(sub.size()-1);
        combsum(ind+1,t,nums,res,sub);
    }
}