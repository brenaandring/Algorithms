public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        while (!hashSet.contains(n)) {
            hashSet.add(n);
            n = findSum(n);
            if (n == 1)
                return true;
        }
        return false;
    }

    public int findSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}