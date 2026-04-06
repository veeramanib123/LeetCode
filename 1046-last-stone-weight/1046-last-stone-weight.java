class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones)
        {
            pq.add(i);
        }
        while(pq.size()>1)
        {
            int t1=pq.poll();
            int t2=pq.poll();
            int diff=Math.abs(t1-t2);
            if(diff!=0)
            {
                pq.add(diff);
            }
        }
        if(pq.size()!=0)
        {
            return pq.poll();
        }
        else
        {
            return 0;
        } 
    }
}