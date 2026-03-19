class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
     ArrayList<int[]> res=new ArrayList<>();
     for(int[] inte:intervals)
     {
        if(res.isEmpty()||inte[0]>res.get(res.size()-1)[1])
        {
            res.add(inte);
        }
        else
        {
            res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],inte[1]);
        }
     } 
     return res.toArray(new int[res.size()][]);  
    }
}