import java.util.Scanner;
import java.util.Stack;

public class Question11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1; // 오름차순 수
        StringBuffer sb = new StringBuffer(); // string에 append 로 자유롭게 할 수 있는
        boolean result = true;

        for (int i = 0; i < A.length; i++) {
            int sq = A[i];
            if (sq >= num) {
                while (sq >= num) {
                    sb.append("+\n");
                    stack.push(num++);
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int k = stack.pop();
                if (k > sq) {
                    System.out.println("NO");
                    result = false;
                    break;
                }else {
                    sb.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(sb);
        }
    }
}
