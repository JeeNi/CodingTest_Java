import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());               // 배열 크기 저장하기
        int M = Integer.parseInt(st.nextToken());               // 질의 수 저장하기

        int A[][] = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {                          // N만큼 반복하기
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());     // 원본 배열 저장하기
            }
        }

        int D[][] = new int[N + 1][N + 1];                      // N만큼 반복하기
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {                      // 합 배열 저장하기
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        for (int i = 0; i < M; i++) {                           // M만큼 반복하기
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}
