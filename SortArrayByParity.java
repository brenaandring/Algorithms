class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] len = new int[A.length];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                len[index] = A[i];
                index++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                len[index] = A[i];
                index++;
            }
        }
        return len;
    }
}