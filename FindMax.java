import java.util.Arrays;

public class FindMax {
    public static double findMax(double[] a) {
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] arr = {23, 123, 4, 213421, -1234, 1234, 9000000.0, 1};
        double max = findMax(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("max = " + max);
    }
}