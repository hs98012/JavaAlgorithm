import java.util.*;

public class Question26 {
    static Boolean[] visited;
    static ArrayList<Integer>[] Array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt(); // v = start_node
        Array = new ArrayList[n + 1];
        visited = new Boolean[n + 1];
        for (int i = 1; i <= n ; i++) {
            Array[i] = new ArrayList<>();
            visited[i] = false;
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int k = sc.nextInt();
            Array[s].add(k);
            Array[k].add(s);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(Array[i]);
        }
        dfs(v);
        System.out.println();
        visited = new Boolean[n+1];
        for (int i = 0; i <= n; i++) {
            visited[i] = false;
        }
        bfs(v);
    }

    static void dfs(int v) {
        System.out.print(v+" ");
//        if (visited[v]) {
//            return;
//        }
        visited[v] = true;
//        System.out.println(v+" ");
        for (int i : Array[v]) {
            if (visited[i] == false) {
                dfs(i);
            }
        }
    }
    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int now_node = queue.poll();
            System.out.print(now_node + " ");
            for (int i : Array[now_node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
