package Leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();

//        System.out.println("Enter input 1 = ");
//        String input1 = br.readLine();

//        System.out.println("Output = " + solution.reverseWords("Hello Mister"));

        int[ ] nums = { 4,2,4,0,0,3,0,5,1,0 };
        solution.moveZeroes(nums);
    }
}
