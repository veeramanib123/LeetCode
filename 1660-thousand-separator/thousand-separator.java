class Solution {
    public String thousandSeparator(int n) {
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        if (s.length()<4)
        {
            return s;
        }
        else
        {
        for(int i=0;i<s.length();i++)
        {
            if (i > 0 && (s.length() - i) % 3 == 0)
            {
            sb.append('.');
            }
            sb.append(s.charAt(i));
        }
        }
        return sb.toString();
    }
}