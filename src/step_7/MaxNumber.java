package step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int A = 0;
        int B = 0;
        int maximum = array[0][0];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] > maximum) {
                    maximum = array[i][j];
                    A = i;
                    B = j;
                }
            }
        }
        System.out.println(maximum);
        System.out.println((A + 1) + " " + (B + 1));
    }
}
