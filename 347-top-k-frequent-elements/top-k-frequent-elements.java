class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (n1,n2)-> map.get(n1)-map.get(n2)
        );
        for (int num :map.keySet())
        {
            pq.add(num);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int[] result=new int[k];
        int i=0;
        while(!pq.isEmpty())
        {
            result[i]=pq.poll();
            i++;
        }        
        return result;
    }
}