import java.util.PriorityQueue;
import java.util.Scanner;

public class Question14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) {
                    return a > b ? 1 : -1;
                }
                else {
                    return absA - absB;
                }
            }); // 음수면 우선순위를 가짐
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                //여기서 입력받음
                int x = sc.nextInt();
                if (x == 0) {
                    if (pq.size() == 0) {
                        System.out.println("0");
                    } else {
                        System.out.println(pq.poll());
                    }
                } else {
                    pq.add(x);
                }
            }
        }
    }

}
