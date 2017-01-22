import java.io.*;
import java.util.*;

/**
 * @author Ievgenii Drozd
 * @version 1/22/17
 *          Diagonal Difference
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[i][n - 1 - i];
        }

        System.out.println(Math.abs(sum1 - sum2));

    }

}
