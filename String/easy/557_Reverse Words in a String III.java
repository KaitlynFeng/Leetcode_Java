class Solution {
    public String reverseWords(String s) {
            StringBuilder sb = new StringBuilder();
            String[] list = s.split(" ");
            for(String word: list) {
                StringBuilder newWord = new StringBuilder(word);
                newWord.reverse();
                sb.append(newWord);
                sb.append(" ");}
            return sb.toString().trim();}
    
    }