public class Solution {
    public int findNumbers(int[] nums) {
        int evenNums = 0;
        for (int i = 0; i < nums.length; i ++) {
            int count = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                count ++;
            }
            if (count % 2 == 0) {
                evenNums ++;
            } else {
                count = 0;
            }
        }
        return evenNums;
    }
}