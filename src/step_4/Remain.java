package step_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Remain {
    public static void main(String[] arts) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] remain = new int[10];

        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            int B = A % 42;
            remain[i] = B;
        }
        // sort를 해가지고 오름차순으로 하면 똑같은 수들이 연속되게 나열되니까
        // 그 나열된 수를 차례대로 비교하고
        // 비교했는데 다른 수가 나오면 그 수로 대체하고, add를 +1 해서 갯수를 추가해준다.
        // tem = temporary 임시 수라는 뜻
        // add는 어차피 무조건 한 가지의 숫자는 있으니까 1로 설정
        // 처음에는 이중 for 문으로 해결하려 했으나 논리에 안맞았음

        Arrays.sort(remain);
        int add = 1;
        int tem = remain[0];
        for (int i = 1; i < 10; i++) {
            if (tem != remain[i]) {
                add++;
                tem = remain[i];
            }
        }
        System.out.println(add);
    }
}
