package step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] now = new int[6];
        int [] original = {1, 1, 2, 2, 2, 8};


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            now[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            now[i] = original[i] - now[i];
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(now[i] + " ");
        }
    }
}
