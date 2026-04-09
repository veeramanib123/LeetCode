class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> h=new HashMap<>();
        String d="balloon";
        for(char c:text.toCharArray())
        {
            if(d.contains(""+c))
            {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        }
        int c=Integer.MAX_VALUE;
        c=Math.min(c,h.getOrDefault('b',0)/1);
        c=Math.min(c,h.getOrDefault('a',0)/1);
        c=Math.min(c,h.getOrDefault('l',0)/2);
        c=Math.min(c,h.getOrDefault('o',0)/2);
        c=Math.min(c,h.getOrDefault('n',0)/1);
        return c==Integer.MAX_VALUE?0:c;
    }
}