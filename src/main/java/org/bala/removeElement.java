package org.bala;

public class removeElement {

        public static int removeElement(int[] nums, int val) {
            if (nums.length < 0)
                return 0;
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == val) {
                    continue;
                } else {
                    nums[i++] = nums[j];
                }
            }
            for(int ab:nums){
                System.out.print(ab+" ");
            }
            return i;
        }

    public static void main(String[] args) {
        int[] abc={1,2,3,1,2,3,1,3,4,4,5,6};
        System.out.println("after removing the '1' element from array  balance count::"+removeElement(abc,1));
    }
}
