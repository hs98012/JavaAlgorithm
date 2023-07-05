import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class question2 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int size = Integer.parseInt(st.nextToken());
            int[][] aSize = new int[size+1][size+1];
            long qNum = Integer.parseInt(st.nextToken());
            long[][] sArray = new long[size+1][size+1];
            sArray[0][0] = 0;
            for (int i = 1; i <= size; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= size; j++ ) {
                    aSize[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    sArray[i][j] = sArray[i][j-1] + sArray[i-1][j] -sArray[i-1][j-1] + aSize[i][j];
                }
            }

            for (int i = 0; i < qNum; i++) {
                st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());
                System.out.println(sArray[x2][y2] -sArray[x2][y1-1]-sArray[x1-1][y2] +sArray[x1-1][y1-1]);
            }

        }
}
