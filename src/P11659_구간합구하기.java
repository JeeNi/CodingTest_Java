import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));   // Scanner 역할
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());   // split 역할

        int suNo = Integer.parseInt(stringTokenizer.nextToken());   // 처음에 입력한 숫자
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 두번째로 입력한 숫자
        long[] S = new long[suNo + 1];  // 1을 더해주는 이유는, 인덱스 값을 1부터 시작하기 위함
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());   // StringTokenizer 재 선언

        for (int i = 1; i <= suNo; i++) {    // 1부터 시작하기 때문에 작거나 같다로
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());    // stringTokenizer.nextToken() 구간 합을 구할 대상 입력
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());   // StringTokenizer 재 선언
            int i = Integer.parseInt(stringTokenizer.nextToken());  // 처음에 입력한 숫자
            int j = Integer.parseInt(stringTokenizer.nextToken());  // 두번째로 입력한 숫자
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
