class Solution {
    public boolean validMountainArray(int[] A) {
        int p = 0;
        // check length of array
        if (A.length < 3) {
            return false;
        }
        // check for mountain peak
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i +1] <= A[i]) {
                p = i;
                break;
            }
        }
        // check for boundaries. Can't be first or last
        if (p == 0 || p == A.length - 1) {
            return false;
        }
        // check for strictly decreasing from p
        for (int i = p; i < A.length - 1; i++) {
            if (A[i] <= A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}