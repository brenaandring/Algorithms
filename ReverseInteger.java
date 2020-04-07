public class Solution {
    public int reverse(int x) {
        int reversedX = 0;
        try {
            while (x != 0) {
                int digit = x % 10;
                //System.out.println("res before: " + reversedX);
                reversedX = Math.addExact(Math.multiplyExact(reversedX, 10), digit);
                //System.out.println("res after: " + reversedX + ", just added: " + digit);
                x = x / 10;
            }
        } catch (ArithmeticException e) {
            return 0;
        }
        return reversedX;
    }
}