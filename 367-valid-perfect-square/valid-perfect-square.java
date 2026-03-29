class Solution {
    public boolean isPerfectSquare(int num) {
        int l=0,h=num;
        while(l<=h)
        {
            int mid=(l+h)/2;
            long sqre=(long) mid*mid;
            if(sqre==num)    return true;
            else if(sqre>num)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return false;        
    }
}