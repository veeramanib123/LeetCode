class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> n=new ArrayList<>();
        for(int no:nums1)
        {
            map.put(no,map.getOrDefault(no,0)+1);
        }
        for(int no:nums2)
        {
            if(map.containsKey(no) && map.get(no)>0)
            {
                map.put(no,map.get(no)-1);
                n.add(no);
            }
        }
        int[] res=new int[n.size()];
        for(int i=0;i<n.size();i++)
        {
            res[i]=n.get(i);
        }
        return res;
    }
}