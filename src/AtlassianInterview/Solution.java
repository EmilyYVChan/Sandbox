package AtlassianInterview;

class Solution {
    public String reverseStr(String s, int k) {
        /**
         start at index 0. loop increment ++2k
         check if there are 2k characters starting at current index
         if > 2k | <2k&&>k then reverse first two characters
         else reverse all

         create a reverse helper method
         */

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i=i+(2*k)) {
            int numOfCharsLeftToEndOfString = s.length() - 1 - i;
            StringBuffer reversedSubstringBuffer = new StringBuffer();
            if (numOfCharsLeftToEndOfString >= (2*k)) {
                reversedSubstringBuffer.append(reverseSubstring(s.substring(i, i+(2*k)), k));
            } else if (numOfCharsLeftToEndOfString >= k) {
                reversedSubstringBuffer.append(reverseSubstring(s.substring(i, i+k), k));
                reversedSubstringBuffer.append(s.substring(i+k, i+numOfCharsLeftToEndOfString+1));
            } else {
                reversedSubstringBuffer.append(reverseSubstring(s.substring(i, i+numOfCharsLeftToEndOfString), k));
            }

            sb.append(reversedSubstringBuffer.toString());
        }

        return sb.toString();

    }

    //k is the number of characters beginning in the substring to be reversed
    public String reverseSubstring(String substring, int k) {
        StringBuffer sb = new StringBuffer();

        for (int i = k-1; i >= 0; i--) {
            sb.append(substring.charAt(i));
        }

        sb.append(substring.substring(k, substring.length()));

        return sb.toString();
    }
}