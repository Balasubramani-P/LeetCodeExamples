package org.bala;

import java.util.Arrays;

public class TwoSum {
        public static int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int[] ans = new int[2];
            int k = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == target) {
                        ans[k++] = i;
                        ans[k++] = j;
                        return ans;
                    }
                }
            }

            return ans;
        }

    public static void main(String[] args) {
        int tar=10;
        int[] nums={5,2,3,6,7,8,5};
        System.out.println("index position of target values in an array="+Arrays.toString(twoSum(nums, tar)));
    }
}
