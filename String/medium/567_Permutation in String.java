class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] alphabet = new int[26];
        for(char c: s1.toCharArray()){ alphabet[c-'a']++; }
        int l=0, r=0, n=s1.length();
        while(r<s2.length()){
            char c = s2.charAt(r);
            if(alphabet[c-'a']>0){alphabet[c-'a']--; r++;
                if(r-l==n){return true; } }
            else{
                while(s2.charAt(l)!=s2.charAt(r)){
                    alphabet[s2.charAt(l)-'a']++; l++;}
                alphabet[s2.charAt(l)-'a']++; l++;}} return false;}


}