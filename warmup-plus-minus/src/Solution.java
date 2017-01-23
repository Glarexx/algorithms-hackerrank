import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/23/17
 *          Plus Minus
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        double pCounter = 0;
        double nCounter = 0;
        double zCounter = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zCounter++;
            } else {
                if (Math.abs(arr[i]) == arr[i]) {
                    pCounter++;
                } else {
                    nCounter++;
                }
            }
        }

        System.out.println(pCounter / n);
        System.out.println(nCounter / n);
        System.out.println(zCounter / n);
    }
}
