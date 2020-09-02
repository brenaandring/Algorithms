//Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
//
//        More formally check if there exists two indices i and j such that :
//
//        i != j
//        0 <= i, j < arr.length
//        arr[i] == 2 * arr[j]
//
//        Constraints:
//
//        2 <= arr.length <= 500
//        -10^3 <= arr[i] <= 10^3

class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sqr = 2 * arr[i];
                if (sqr == arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}