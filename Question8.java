import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (k = 0; k < n; k++) {
            int find = a[k];
            int i = 0;
            int j = n - 1;
            while (i < j) {
                if (a[i] + a[j] == find) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (a[i] + a[j] > find) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
