package step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class St {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char [] sary = S.toCharArray();

        int A = Integer.parseInt(br.readLine());
        System.out.println(sary[A - 1]);
    }
}
