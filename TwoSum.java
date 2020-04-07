public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int x=0; x < nums.length; x++) {
                if(i != x) {
                    int sum = nums[i] + nums[x];
                    if(sum == target) {
                        int[] result = new int[]{i, x};
                        return result;
                    }
                }
            }
        }
        return new int[0];
    }
}