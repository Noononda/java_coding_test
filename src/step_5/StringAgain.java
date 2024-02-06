package step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringAgain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            char [] text = S.toCharArray();

            for (int k = 0; k < text.length; k++) {
                 for (int j = 0; j < count; j++) {
                    System.out.print(text[k]);
                }
            } System.out.print("\n");
        }
    }
}
