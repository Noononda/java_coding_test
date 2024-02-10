package step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AddArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer sr = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int number = Integer.parseInt(sr.nextToken());
                A[i][j] = number;
            }
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer sr = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int number = Integer.parseInt(sr.nextToken());
                B[i][j] = number;
            }
        }

        int[][] add = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                add[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
