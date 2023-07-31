import java.util.PriorityQueue;
import java.util.Scanner;

public class Question1927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue minQueue = new PriorityQueue();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (minQueue.size() >0 && k == 0) {
                System.out.println("minQueue = " + minQueue.poll());
            } else if (k > 0) {
                minQueue.add(k);
            } else if (minQueue.size() == 0 && k == 0) {
                System.out.println("0");
            }
        }

    }
}
