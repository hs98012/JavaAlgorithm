import java.util.*;

public class Question23 {

    static int node;
    static int edge;
    static ArrayList<Integer> []A;
    static Boolean visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node = sc.nextInt();
        edge = sc.nextInt();
        A = new ArrayList[node + 1];
        visited = new Boolean[node+1];

        for(int i=1;i<node+1;i++) {
            A[i] = new ArrayList<Integer>();
            visited[i] = false;
        }
        for(int i=0;i<edge;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            A[n].add(m);
            A[m].add(n);
        }
        int count = 0;
        for (int i = 1; i < node + 1; i++) {
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        System.out.println("count = " + count);
    }

    static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if(visited[i]==false){
                dfs(i);
            }
        }
    }
}
