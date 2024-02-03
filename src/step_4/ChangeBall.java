package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ChangeBall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int x = 0; x < M; x++) {
            StringTokenizer ss = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(ss.nextToken());
            int B = Integer.parseInt(ss.nextToken());

            // 배열의 숫자를 직접적으로 바꾸면 서로 다 바뀌어버리니까 다론 변수에 할당해놓고
            // 그 변수를 이용하여 값을 배열에 다시 할당해준다.
            int a = basket[A - 1];
            int b = basket[B - 1];
            // 인덱스이기 때문에 A - 1, B - 1을 꼭 해줘야 함!!!! 안하면 꼬임
            basket[A - 1] = b;
            basket[B - 1] = a;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}