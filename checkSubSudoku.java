// Do not remove these imports. You may add others if you wish.
import java.io.*;
import java.util.*;

public class Solution {
    // If you need extra classes, you can define them privately here within class Solution

    /*
      Args:
        matrix: an NxN int[][] containing the matrix to check
      Returns:
        The String "VALID" if matrix contains a valid sub-sudoku solution, and
        "INVALID" otherwise
    */
    static String checkSubSudoku(int[][] matrix) {
        // Your code goes here.
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> group = new HashSet<Integer>();
            for (int j = 0; j < matrix.length; j++) {
                int a = matrix[i][j];
                if (a > 0 && a <= matrix.length) {
                    if (group.contains(a)) {
                        return "INVALID";
                    } else {
                        group.add(a);
                    }
                } else {
                    return "INVALID";
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> group = new HashSet<Integer>();
            for (int j = 0; j < matrix.length; j++) {
                int a = matrix[j][i];
                if (a > 0 && a <= matrix.length) {
                    if (group.contains(a)) {
                        return "INVALID";
                    } else {
                        group.add(a);
                    }
                } else {
                    return "INVALID";
                }
            }
        }
        return "VALID";
    }

    // DO NOT MODIFY MAIN()
    public static void main(String[] args) {
        List<String[]> numbers = new ArrayList<String[]>();

        String line;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while ((line = br.readLine()) != null) {
                if (line.equals("")) {
                    continue;
                }

                numbers.add(line.split(" "));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        int[][] matrix = new int[numbers.size()][numbers.size()];
        for(int i = 0; i < numbers.size(); i++) {
            for(int j = 0; j < numbers.size(); j++) {
                matrix[i][j] = Integer.parseInt(numbers.get(i)[j]);
            }
        }

        System.out.println(checkSubSudoku(matrix));

    }
}

