import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dNum = sc.nextInt();
        long[] array = new long[dNum + 1];
        int qNum = sc.nextInt();
        long[] sArray = new long[dNum + 1];
        array[0] = 0;
        sArray[0] = 0;
        for (int i = 1; i <= dNum ; i++) {
            array[i] = sc.nextInt();
            sArray[i] = sArray[i-1] + array[i];
        }
        for (int i = 0; i < qNum; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(sArray[end] - sArray[start-1]);
        }
    }
}
