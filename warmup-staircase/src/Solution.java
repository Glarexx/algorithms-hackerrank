import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/25/17
 *          Staircase
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            printSpaces(n - i);
            printDiez(i);
        }
    }

    private static void printSpaces(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(" ");
        }
    }

    private static void printDiez(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
