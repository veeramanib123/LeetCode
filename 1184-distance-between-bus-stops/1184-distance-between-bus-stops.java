class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int fd=0,sd=0;
        for(int i=start;i!=destination;i=(i+1)%distance.length)
        {
            fd+=distance[i];
        }
        for(int i=destination;i!=start;i=(i+1)%distance.length)
        {
            sd+=distance[i];
        }
        return Math.min(fd,sd);
        
    }
}