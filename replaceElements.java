class Solution {
    public int[] replaceElements(int[] arr) {
        int result[] = new int[arr.length];
        int max = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            result[i] = max;
            max = Math.max(arr[i], max);
        }
        result[arr.length - 1] = -1;
        return result;
    }
}