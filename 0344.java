// https://leetcode.com/problems/reverse-string/

public class Solution {
    public String reverseString(String s) {
        StringBuffer result = new StringBuffer();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        
        return result.toString();
    }
}
