package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReverseBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] basket = new int[N];

        // 바스켓 배열 만들기
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }


        for (int i = 0; i < M; i++) {
            StringTokenizer sr = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(sr.nextToken());
            int B = Integer.parseInt(sr.nextToken());

            int x = 0;
            if ((B - A) % 2 == 0) {
                x = (B - A) / 2;
            } else {
                x = ((B - A) / 2) + 1;
            }

            int temp = 0;
            for (int j = 0; j < x ; j++) {
                temp = basket[A - 1 + j];
                basket[A - 1 + j] = basket[B - 1 - j];
                basket[B - 1 - j] = temp;
            }
        }
        for (int j : basket) {
            System.out.print(j + " ");
        }
    }
}
