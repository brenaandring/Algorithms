public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int w = m + n - 1;
        while (i >= 0 && j >= 0) {
            int a = nums1[i];
            int b = nums2[j];
            if (a < b) {
                nums1[w--] = b;
                j --;
            } else {
                nums1[w--] = a;
                i --;
            }
        }
        while (i >= 0) {
            nums1[w--] = nums1[i--];
        }
        while(j >= 0) {
            nums1[w--] = nums2[j--];
        }
    }
}