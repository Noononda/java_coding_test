package step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class ColoredPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] paper = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int [] minusA = new int[N];
        for (int i = 0; i < N; i++) {

        }

        for (int i = 0; i < N; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.print(paper[i][j] + "\t");
            }
        }
    }
}
