public class Solution {
    /**
     * @param str: A string
     * @return: An integer
     */
    public int stringToInteger(String str) {
        // write your code here
        if (str == null || str == ""){
            return 0;
        }
        
        boolean isNeg = str.charAt(0) =='-';
        int start = isNeg ? 1:0;
        int negInd = isNeg ? -1:1;
        int result = 0;
        for (int i=start;i<str.length();i++){
            char ch = str.charAt(i);
            int digit = ch-'0';
            result = result*10+ digit;
        }
        return result*negInd;
    }
}
