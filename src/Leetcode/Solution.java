package Leetcode;

import java.util.*;

class Solution {
    public void moveZeroes(int[] nums) {
        /**
         firstZeroPos tracker. first find the first zero

         loop through nums[i]
         if nums[i] != 0
         swap with zero at firstZeroPos
         loop through nums starting at firstZeroPos to find the next first Zero


         */
        int firstZeroPos = findFirstZeroPositionIfExists(nums, 0);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[firstZeroPos] == 0) {
                nums[firstZeroPos] = nums[i];
                nums[i] = 0;

                firstZeroPos = findFirstZeroPositionIfExists(nums, firstZeroPos+1);
            }
        }
    }

    private int findFirstZeroPositionIfExists(int[] nums, int searchStartPosition) {
        int firstZeroPosition = 0;
        for (int i = searchStartPosition; i < nums.length; i++) {
            if (nums[i] == 0) {
                firstZeroPosition = i;
                break;
            }
        }
        return firstZeroPosition;
    }
}