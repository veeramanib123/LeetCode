class Solution {
    public boolean isUgly(int n) {
    int p=n;
        if (p<=0) return false;
        while(p%2 == 0){
            p/=2;
        }
        while(p%3 == 0){
            p/=3;
        }
        while(p%5 == 0){
            p/=5;
        }
    return p==1;   
    }
}