package step_6;

import step_5.St;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class GroupWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            char[] word = S.toCharArray();
            int[] intword = new int[word.length];

            for (int j = 0; j < word.length; j++) {
                intword[i] = word[i] - '0';
            }

            Arrays.sort(word);

            int A = 0;
            for (int j = 0; j < word.length; j++) {
                Arrays.asList(word).indexOf(word[j]);
                A ++;
            }
        }
    }
}