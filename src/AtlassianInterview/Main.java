package AtlassianInterview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Solution solution = new Solution();

        System.out.println("Enter input 1 = ");
        String input1 = br.readLine();

        System.out.println("Enter input 2 = ");
        int input2 = Integer.parseInt(br.readLine());

        System.out.println("Output = " + solution.reverseStr(input1, input2));


    }
}
