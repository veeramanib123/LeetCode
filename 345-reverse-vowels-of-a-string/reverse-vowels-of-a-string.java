class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char[] chars=s.toCharArray();
        String vowels="AEIOUaeiou";
        while(l<r)
        {
            while (l < r && vowels.indexOf(chars[l]) == -1) {
                l++;
            }
            while (l < r && vowels.indexOf(chars[r]) == -1) {
                r--;
            }      
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        return new String(chars);
    }
}