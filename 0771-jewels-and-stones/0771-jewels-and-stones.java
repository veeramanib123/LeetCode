class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        HashSet<Character> hs=new HashSet<>();
        for(char ch:jewels.toCharArray())
        {
            hs.add(ch);
        }
        for(int i=0;i<stones.length();i++)
        {
            if(hs.contains(stones.charAt(i)))
            {
                c++;
            }
        }
        return c;
    }
}