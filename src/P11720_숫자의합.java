import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();                         // num 값 입력받기
        String sNum = sc.next();                        // 길이 num의 숫자를 입력받아 String형 변수 sNum에 저장하기
        char[] cNum = sNum.toCharArray();               // sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
        int sum = 0;                                    // int형 변수 sum 선언하기
        for (int i = 0; i < cNum.length; i++) {         // for(cNum 길이만큼 반복하기)
            sum += cNum[i] - '0';                       // 배열의 index 값을 정수형(아스키코드 사용)으로 변환하여 sum에 더하여 누적하기
        }
        System.out.println(sum);                        // sum 출력하기
    }
}
