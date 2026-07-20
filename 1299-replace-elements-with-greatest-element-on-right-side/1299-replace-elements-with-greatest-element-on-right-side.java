class Solution {
    public int[] replaceElements(int[] arr) {
        int[] a=new int[arr.length];
        
        for(int l=0;l<arr.length;l++)
        {
            int max=-1;
            int r=l+1;
            while(r<arr.length)
            {
                max=Math.max(max,arr[r]);
                r++;
            }
            a[l]=max;
        }
       return a; 
    }
}