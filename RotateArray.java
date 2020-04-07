public class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i <k; i ++) {
            shiftByOne(nums);
        }
    }

    private void shiftByOne(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int prev = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            int tmp = nums[i];
            nums[i] = prev;
            prev = tmp;
        }
        nums[0]=prev;
    }
}