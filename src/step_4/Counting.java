package step_4;

import java.util.Arrays;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int [] ary = new int [N];

        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            ary[i] = A;
        }

        int B = scan.nextInt();
        int E = 0;
        for (int i = 0; i < N; i++) {
            if (ary[i] == B) {
                E++;
            }
        }
        System.out.println(E);
    }
}
