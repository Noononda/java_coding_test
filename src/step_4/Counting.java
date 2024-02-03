package step_4;

import java.util.Arrays;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        // 값을 받아온다.
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // 배열을 생성한다. N만큼 크기라고 했으니까 N을 넣어줌.
        int [] ary = new int [N];

        // 배열 ary에 값을 하나씩 넣어준다.
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
