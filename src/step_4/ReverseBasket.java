package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class ReverseBasket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] basket = new int[N];
        int [] anobasket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer sr = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(sr.nextToken());
            int B = Integer.parseInt(sr.nextToken());

            int x = A - B;

            for (int j = 0; j < x; j++) {
                int ex = 0;
                basket[j] = anobasket[j - (2 * ex)];
            }

        }

    }
}
