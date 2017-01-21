import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/20/17
 *          A Very Big Sum
 */
public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String elements = in.nextLine();
        String[] arrayOfString = elements.split("\\s+");

        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = BigInteger.valueOf(Long.valueOf(arrayOfString[i]));
        }

        BigInteger sum = new BigInteger("0");
        for (BigInteger b : arr) {
            sum = sum.add(b);
        }
        System.out.println(sum);
    }
}
