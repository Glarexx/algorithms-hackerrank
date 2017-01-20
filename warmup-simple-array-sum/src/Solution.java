import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/**
 * @author Ievgenii Drozd
 * @version 1/18/17
 *          Given an array of  integers, can you find the sum of its elements?
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        String elements = in.nextLine();
        String[] arrayOfString = elements.split("\\s+");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrayOfString[i]);
        }

        System.out.println(IntStream.of(arr).sum());
    }
}