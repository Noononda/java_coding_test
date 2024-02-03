package step_2;
import java.util.Scanner;
        public class DicePrize {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int A = scan.nextInt();
                int B = scan.nextInt();
                int C = scan.nextInt();

                if (A == B && B == C) {
                    System.out.println(10000 + (A * 1000));
                } else if (A != B && B != C && A != C) {
                    if (A > B && A > C) {
                        System.out.println(A * 100);
                    } else if (B > A && B > C) {
                        System.out.println(B * 100);
                    } else if (C > A && C > B) {
                        System.out.println(C * 100);
                    }
                } else if (A == B && A != C) {
                    System.out.println(1000 + (A * 100));
                } else if (A != B && A == C) {
                    System.out.println(1000 + (A * 100));
                } else if (B == C && A != C) {
                    System.out.println(1000 + (B * 100));
                }
            }
        }
// Math.max(A,B)