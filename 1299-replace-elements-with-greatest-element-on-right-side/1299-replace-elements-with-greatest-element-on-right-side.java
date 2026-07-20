class Solution {
    public int[] replaceElements(int[] arr) {
        int[] a=new int[arr.length];
        int max=-1;
        for(int r=arr.length-1;r>=0;r--)
        {
            if(r==arr.length-1)
            {
                max=-1;
            }
            else
            {
            max=Math.max(max,arr[r+1]);
            }
            a[r]=max;
        }
       return a; 
    }
}