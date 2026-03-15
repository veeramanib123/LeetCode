class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int len=0,l=0;
        Set<Character> charset=new HashSet<>();
        for(int r=0;r<n;r++)
        {
            while(charset.contains(s.charAt(r)))
            {
                charset.remove(s.charAt(l));
                l++;
            }
            charset.add(s.charAt(r));
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}