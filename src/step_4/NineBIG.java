package step_4;

import java.util.Scanner;

public class NineBIG {
    public static void main(String[] args) {
        int [] ary = new int[9];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            ary[i] = scan.nextInt();
        }
        int A = 0;
        int B = 0;
        for (int i = 0; i < 9; i++) {
            if (A < ary[i]) {
                A = ary[i];
                B = i + 1;
            }
        }
        System.out.println(A);
        System.out.println(B);
    }
}
