class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> count =new HashMap<>();
        for(int x:arr)
        {
            count.put(x,count.getOrDefault(x,0)+1);
        }
        Set<Integer> s=new HashSet<>();
        for(int x:count.values())
        {
            s.add(x);
        }
        return count.size()==s.size();
        
    }
}