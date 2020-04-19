public class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i] + 1)) {
                count++;
            }
        }
        return count;
    }
}
