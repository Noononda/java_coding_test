package step_3;

import java.util.Scanner;

public class NineNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 1 ; i < 10 ; i++ ) {
            System.out.println(N + " * " + i +" = " + (N * i));
        }
    }
}
