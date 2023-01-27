import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();                           // 변수 N에 과목의 수 입력받기
        int A[] = new int[N];                           // 길이가 N인 1차원 배열 A[] 선언하기

        for (int i = 0; i < N; i++) {                   // for(A[] 길이만큼 반복하기)
            A[i] = sc.nextInt();                        // A[i]에 각 점수 저장하기 
        }

        long max = 0;                                   // long 타입의 max 변수 선언하기
        long sum = 0;                                   // long 타입의 sum 변수 선언하기
        for (int i = 0; i < N; i++) {                   // for(A[] 길이만큼 반복하기)
            if (A[i] > max) max = A[i];                 // 최고점은 변수 max에, 총점은 변수 sum에 저장하기
            sum += A[i];
        }
        System.out.println(sum * 100.0 / max / N);      // sum * 100 / max / N 출력하기
    }
}
