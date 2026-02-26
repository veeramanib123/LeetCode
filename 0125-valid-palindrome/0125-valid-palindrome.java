class Solution {
    public boolean isPalindrome(String s) {
        String b=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int l=0,r=b.length()-1;
        if(b.isEmpty())return true;
        while(l<=r)
        {
            if(b.charAt(l)!=b.charAt(r))
            {
               return false; 
            }
            l++;
            r--;
            
        }
        return true;
    }
}