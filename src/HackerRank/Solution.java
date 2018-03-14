package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String s){
        // Complete this function
        /**
         loop over s. for each char
         store char in histogram

         get a frequency count
         find most common frequency

         loop over histogram keys
         if histogram value != frequency
         if (histogram value - 1 = 0 || histogram value - 1 = freq) then continue
         return NO

         return YES
         */

        HashMap<Character, Integer> histogram = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (histogram.containsKey(c)) {
                int newCount = histogram.get(c) + 1;
                histogram.put(c, newCount);
            } else {
                histogram.put(c, 1);
            }
        }

        HashMap<Integer, Integer> freqOfFreq = new HashMap<>();
        int mostCommonFreq = 0;
        int freqOfMostCommonFreq = 0;
        for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
            if (freqOfFreq.containsKey(entry.getValue())) {
                freqOfFreq.put(entry.getValue(), freqOfFreq.get(entry.getValue()) + 1);
            } else {
                freqOfFreq.put(entry.getValue(), 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : freqOfFreq.entrySet()) {
            if (entry.getValue() > freqOfMostCommonFreq) {
                freqOfMostCommonFreq = entry.getValue();
                mostCommonFreq = entry.getKey();
            }
        }

        boolean hasAlreadyDeletedOneChar = false;
        for (Map.Entry<Character, Integer> entry : histogram.entrySet()) {
            int charFreq = entry.getValue();
            if (charFreq != mostCommonFreq) {
                if (!hasAlreadyDeletedOneChar && ((charFreq-1 == 0) || (charFreq-1 == mostCommonFreq))) {
                    hasAlreadyDeletedOneChar = true;
                    continue;
                } else {
                    return "NO";
                }
            }
        }
        return "YES";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
