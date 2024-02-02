package step_3;

import java.util.Scanner;
public class Costco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            sum = sum + (a * b);
        }
        if (sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
