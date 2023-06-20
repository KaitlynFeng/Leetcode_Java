class Solution {
    int position = 0; int maxLen = 0;
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++) {
            helper(s,i,i); helper(s, i, i+1);}
        return s.substring(position, position+maxLen);}
    private void helper(String s, int i, int j) {
        int len = 0;
        if(i==j) { len=1; i--; j++;}        
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) { len+=2; i--; j++;}
        if(len>maxLen) { position=i+1; maxLen = len;}}}

