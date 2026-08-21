class Solution {
    public int compress(char[] chars) {
        String s="";
        int l=0,c=1;
        for(int r=1;r<chars.length;r++)
        {
            if(chars[l]==chars[r])
            {
                c++;
            }
            else
            {
                s+=chars[l]+(c>1?String.valueOf(c):"");
                c=1;
                l=r;
            }    
        }
        s += chars[l] + (c > 1 ? String.valueOf(c) : "");
        for (int i = 0; i < s.length(); i++) 
        {
            chars[i] = s.charAt(i);
        }
        return s.length();
        
    }
}