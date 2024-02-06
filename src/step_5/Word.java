package step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] now = S.toCharArray();
        int[] word = new int[S.length()];
        int[] alpha = new int[26];
        int[] abc = new int[26];

        Arrays.fill(abc, -1);

        for (int i = 0; i < now.length; i++) {
            int number = (int) now[i];
            word[i] = number;
        }

        int a = 97;
        for (int i = 0; i < 26; i++) {
            alpha[i] = a;
            a++;
        }


        for (int i = 0; i < now.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (word[i] == alpha[j]) {
                    if (abc[j] == -1) {
                        abc[j] = i;
                        break;
                    } else if (abc[j] != -1) {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");
        }
    }
}