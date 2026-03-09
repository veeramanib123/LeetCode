class Solution {
    public boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int[] charc=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            charc[s1.charAt(i)-'a']++;
            charc[s2.charAt(i)-'a']--;
        }
        for(int c:charc)
        {
            if(c!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}