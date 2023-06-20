class Solution {
    public int myAtoi(String str) {
            if (str==null || str.length()==0) return 0;
            str=str.trim(); if(str.length()==0) return 0;
            int sign = 1, base = 0, i = 0;
            if (str.charAt(i) == '-' || str.charAt(i) == '+') {
                sign = str.charAt(i++) == '-' ? -1 : 1;}
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                if (base > Integer.MAX_VALUE/10 || (base == Integer.MAX_VALUE/10 && str.charAt(i) - '0'>7)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE; }
                base = 10 * base + (str.charAt(i++) - '0');}
            return base * sign; }
    
    }