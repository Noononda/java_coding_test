package step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char [] letter = S.toCharArray();
        int [] count = new int[letter.length];

        for (int i = 0; i < S.length(); i++) {
            if (letter[i] == 'A' || letter[i] == 'B' || letter[i] == 'C') {
                letter[i] = '2';
            } else if (letter[i] == 'D' || letter[i] == 'E' || letter[i] == 'F') {
                letter[i] = '3';
            } else if (letter[i] == 'G' || letter[i] == 'H' || letter[i] == 'I') {
                letter[i] = '4';
            } else if (letter[i] == 'J' || letter[i] == 'K' || letter[i] == 'L') {
                letter[i] = '5';
            } else if (letter[i] == 'M' || letter[i] == 'N' || letter[i] == 'O') {
                letter[i] = '6';
            } else if (letter[i] == 'P' || letter[i] == 'Q' || letter[i] == 'R' || letter[i] == 'S') {
                letter[i] = '7';
            } else if (letter[i] == 'T' || letter[i] == 'U' || letter[i] == 'V') {
                letter[i] = '8';
            } else if (letter[i] == 'W' || letter[i] == 'X' || letter[i] == 'Y' || letter[i] == 'Z') {
                letter[i] = '9';
            }
        }

        int second = 0;
        for (int i = 0; i < letter.length; i++) {
            count[i] = letter[i]-'0' ;
            second = second + count[i] + 1;
        }

        System.out.println(second);
    }
}
