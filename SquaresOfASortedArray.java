public class Solution {
    public int[] sortedSquares(int[] A) {
        int[] newArray = new int[A.length];
        for (int i = 0; i < A.length; i ++)
            newArray[i] = A[i] * A[i];

        Arrays.sort(newArray);
        return newArray;
    }
}