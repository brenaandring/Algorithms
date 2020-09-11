class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                count++;
                nums[count - 1] = nums[i];
            }
        }
        for (int j = length - 1; j > count - 1; j--)
            nums[j] = 0;
    }
}