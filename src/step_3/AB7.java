package step_3;

import java.util.Scanner;

public class AB7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println("Case #" + i +": "+ (A + B));
        }
    }
}