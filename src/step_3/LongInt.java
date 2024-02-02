package step_3;

import java.util.Scanner;
public class LongInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 1; i <= (N / 4); i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
