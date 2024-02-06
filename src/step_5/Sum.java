package step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String A = br.readLine();
        char [] number = A.toCharArray();

        int sum = 0;
        for (int i = 0; i < N; i++ ) {
            int a = Character.getNumericValue(number[i]);
            sum += a;
        }
        System.out.println(sum);
    }
}
