package step_4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigSmall {
    public static void main(String[] args) throws IOException {

        // 수 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // N은 맨 처음에 주어지는 수(String으로 받아오기 때문에 int로 변환해주기)

        // ary라는 배열을 만든다. 배열 크기는 N(아까 받아온 수)
        int [] ary = new int [N];

        // 다음에 받아올 수를 공백을 토대로 미리 쪼개 놓는다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // for 문을 사용하여 숫자를 모두 배열에 넣어준다.
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            ary[i] = A;
        }
        br.close();

        // 배열을 작은수부터 차례대로 정렬한다.
        Arrays.sort(ary);

        // 가장 작은 수인 인덱스의 첫번째 ary[0]과 가장 큰 수인 인덱스의 마지막 수 ary[N - 1]을 출력
        System.out.print(ary[0] + " " + ary[N - 1]);

    }
}
