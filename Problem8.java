import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int start = 0;
        int end = n-1;
        int count = 0;
        while (start < end) {
            if (array[start] + array[end] < m) {
                start++;
            } else if (array[start] + array[end] > m) {
                end--;
            } else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println("count = " + count);
    }
}