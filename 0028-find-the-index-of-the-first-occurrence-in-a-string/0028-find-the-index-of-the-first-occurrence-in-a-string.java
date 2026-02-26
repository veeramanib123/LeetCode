class Solution {
    public int strStr(String haystack, String needle) {
        int l=0,r=0,start=-1;
        while(l<=haystack.length()-1)
        {
            if(haystack.charAt(l)==needle.charAt(r))
            {
                l++;
                r++;
                if(r==needle.length())
                {
                    start=l-r;
                    break;
                }
            }
            else
            {
            l++;
            r=0;
            }
        }
        return start;
    }
}