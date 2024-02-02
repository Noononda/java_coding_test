package step_3;

import java.util.Scanner;
public class AB5 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        boolean right = true;
        while (right) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            if (A != 0 && B != 0) {
                System.out.println(A + B);
            } else if (A == 0 && B == 0) {
                right = false;
            }
        }
    }
}

