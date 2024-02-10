package step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LengthReading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] word = new int[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                word[i][j] = 999;
            }
        }

        for (int i = 0; i < 5; i++) {
            String S = br.readLine();
            char[] chrArr = S.toCharArray();
            for (int j = 0; j < chrArr.length; j++) {
                word[i][j] = (int)chrArr[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (word[j][i] != 999) {
                    System.out.print((char)word[j][i]);
                }
            }
        }
    }
}

