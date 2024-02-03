package step_4;

import java.util.Arrays;
import java.util.Scanner;

public class BallBasket {
    public static void main(String[] args) {
        // 값 받아오기 위해서 scanner
        Scanner scan = new Scanner(System.in);

        // N과 M을 먼저 받아온다
        int N = scan.nextInt();
        int M = scan.nextInt();

        // basket 배열을 생성해준다. 문제에서 N만큼의 배열이라고 했으니까 N을 넣어줌.
        int[] basket = new int[N];

        // 임의의 값 x로 for 문을 실행. i,j,k는 할 때 마다 새롭게 받아와야 하니까 for 문 안에 넣음.
        for (int x = 1; x <= M; x++) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            int k = scan.nextInt();

            // 임의의 값 a로 for 문을 실행. 인덱스로 해야하기 때문에 i - 1 로 넣어줬다.
            // 숫자 k가 적힌 공을 넣는다고 했으니까 k를 넣어준다고 함.
            for (int a = i - 1; a < j; a++) {
                basket[a] = k;
            }
        }

        // 출력 형식이 배열 형식이 아닌, 그냥 나열이었기 때문에 print를 썼다.
        for (int x = 0; x < N; x++) {
            System.out.print(basket[x] + " ");
        }
    }
}
