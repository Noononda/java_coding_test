package step_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] word = s.toCharArray();
        int [] noword = new int[word.length];

        for (int i = 0; i < word.length; i++) {
            int no = word[i];
            noword[i] = no;
        }

        Arrays.sort(noword);

        int add = 0;
        int sum = 0;
        int good = 0;
        int better = 0;

        for (int i = 1; i < noword.length; i++) {
            for (int j = 0; j < i; j++) {
                if (noword[i] == noword[j]) {
                    add++;
                    good = noword[j];
                } else {
                    if (add > sum) {
                        sum = add;
                        better = noword[i];
                        add = 0;
                    } else if (add == sum) {

                    }
                }
            }
        }
        System.out.println(Arrays.toString(noword));
        System.out.print(add + " " + sum + " " + good + " " + better );

    }
}
