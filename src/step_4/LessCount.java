package step_4;

import java.util.Scanner;

public class LessCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int [] ary = new int[N];

        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            ary[i] = A;
            if (ary[i] < X) {
                System.out.print(ary[i] + " ");
            }
        }

    }
}
