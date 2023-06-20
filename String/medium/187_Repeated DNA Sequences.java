class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
                List<String> res = new ArrayList<>();
         if(s==null || s.length()<10) return res;
         Set<String> ans = new HashSet<>();
         Set<String> set = new HashSet<>();
         for(int i=0; i<=s.length()-10; i++) {
             String temp= s.substring(i,i+10);
             if(set.contains(temp)) {ans.add(temp);}
             set.add(temp); }
         res.addAll(ans); return res;}
 
 }