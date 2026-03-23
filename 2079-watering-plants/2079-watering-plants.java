class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n=plants.length;
        int cur=capacity;
        int step=0;
        for(int i=0;i<n;i++)
        {
            if(cur<plants[i])
            {
                cur=capacity;
                step+=i*2;
            }
            cur=cur-plants[i];
            step+=1;
        }
        return step;
    }
}